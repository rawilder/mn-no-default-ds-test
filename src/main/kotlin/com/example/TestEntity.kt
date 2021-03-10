package com.example

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "test_entity")
data class TestEntity(
    var name: String
) {
    @Id
    @GeneratedValue
    var id: Int = 0
}
