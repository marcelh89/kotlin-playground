package com.something.betterTodo

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : PagingAndSortingRepository<Todo, Long>, CrudRepository<Todo, Long> {
    fun findByTitleContaining(@Param("query") query: String, page: Pageable): Page<Todo>
    fun findByDescriptionContaining(@Param("query") query: String, page: Pageable): Page<Todo>
}