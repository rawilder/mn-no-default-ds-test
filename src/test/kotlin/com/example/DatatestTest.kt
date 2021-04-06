package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer

@MicronautTest
class DatatestTest(
    private val embeddedServer: EmbeddedServer,
    private val application: EmbeddedApplication<*>
): StringSpec({

    @Client("/api/v1/customer")
    val client: RxHttpClient = autoClose(
        embeddedServer.applicationContext.createBean(
            RxHttpClient::class.java,
            embeddedServer.url
        )
    )

    "test the server is running" {
        assert(application.isRunning)
    }

    "count by test enum" {
        client.toBlocking().retrieve("/testentity", Long::class.java).shouldNotBeNull()
    }
})
