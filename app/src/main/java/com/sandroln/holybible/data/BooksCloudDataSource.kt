package com.sandroln.holybible.data

import com.sandroln.holybible.data.net.BookCloud
import com.sandroln.holybible.data.net.BooksService

interface BooksCloudDataSource {

    suspend fun fetchBooks(): List<BookCloud>

    class Base(private val service: BooksService) : BooksCloudDataSource {
        override suspend fun fetchBooks() = service.fetchBooks()
    }
}