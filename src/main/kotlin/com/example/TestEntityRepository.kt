package com.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.RxJavaCrudRepository

@Repository
interface TestEntityRepository : RxJavaCrudRepository<TestEntity, Int>
