package com.example.test.data.entity

import com.example.test.enum.TestEnum
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test_entity")
class TestEntity(
    @Id
    @GeneratedValue
    var id: Int = 0,
    var name: String = "test",
    @Enumerated(EnumType.STRING)
    var enumColumn: TestEnum
)
