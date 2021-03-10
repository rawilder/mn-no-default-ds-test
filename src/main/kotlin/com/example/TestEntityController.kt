package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Flowable

@Controller("/testentity")
class TestEntityController(
    val testEntityRepository: TestEntityRepository
) {
    @Get
    fun getAllTestEntities(): Flowable<TestEntity> = testEntityRepository.findAll()
}
