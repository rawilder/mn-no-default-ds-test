package com.example.db2

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.RxJavaCrudRepository

@Repository("testdatasource")
interface TestEntity2Repository : RxJavaCrudRepository<TestEntity2, Int>
