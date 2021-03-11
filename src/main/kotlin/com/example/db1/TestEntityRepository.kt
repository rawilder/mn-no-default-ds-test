package com.example.db1

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.RxJavaCrudRepository

@Repository
interface TestEntityRepository : RxJavaCrudRepository<TestEntity, Int>
