package io.polarian.springdatarest

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "books")
interface BookRepository : PagingAndSortingRepository<Book, Int> {
    fun findByTitle(@Param("title") title: String, pageable: Pageable): Page<Book>
    fun findByAuthor(@Param("author") author: String, pageable: Pageable): Page<Book>
}