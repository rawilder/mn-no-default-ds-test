package com.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.RxJavaCrudRepository

@Repository(value = "testdatasource")
interface TestEntityRepository : RxJavaCrudRepository<TestEntity, Int>
