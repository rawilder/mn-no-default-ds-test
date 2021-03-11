package com.example.db2

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test_entity")
data class TestEntity2(
    var name: String
) {
    @Id
    @GeneratedValue
    var id: Int = 0
}
