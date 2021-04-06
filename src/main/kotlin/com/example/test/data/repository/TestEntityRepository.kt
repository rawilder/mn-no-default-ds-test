package com.example.test.data.repository

import com.example.test.data.entity.TestEntity
import com.example.test.enum.TestEnum
import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.RxJavaCrudRepository
import io.reactivex.Single

@Repository
interface TestEntityRepository : RxJavaCrudRepository<TestEntity, Int> {
    @Query("SELECT COUNT(t) FROM TestEntity t WHERE t.enumColumn = :enumColumn")
    fun countByEnumColumn(enumColumn: TestEnum): Single<Long>
}
