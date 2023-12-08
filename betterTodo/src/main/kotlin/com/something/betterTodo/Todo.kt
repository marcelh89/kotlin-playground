package com.something.betterTodo

import jakarta.persistence.*

@Entity
class Todo(
    @Column(columnDefinition = "VARCHAR", length = 100) var title: String?,
    @Column(columnDefinition = "VARCHAR", length = 1000) var description: String?
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

}