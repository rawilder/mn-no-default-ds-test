package com.example.db2

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Flowable

@Controller("/testentity2")
class TestEntity2Controller(
    val testEntity2Repository: TestEntity2Repository
) {
    @Get
    fun getAllTestEntities(): Flowable<TestEntity2> {
        return testEntity2Repository.findAll()
    }
}
