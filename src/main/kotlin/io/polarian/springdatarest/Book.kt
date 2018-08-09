package io.polarian.springdatarest

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id

@Entity
data class Book(
        @Id @GeneratedValue(strategy = IDENTITY) val id: Int,
        val title: String,
        val author: String,
        val pages: Int)