package com.example.test.controller

import com.example.test.data.repository.TestEntityRepository
import com.example.test.enum.TestEnum
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller("/testentity")
class TestEntityController(
    val testEntityRepository: TestEntityRepository
) {
    @Get
    fun countByTestEnum(): Single<Long> = testEntityRepository.countByEnumColumn(TestEnum.ENUM_ONE)
}
