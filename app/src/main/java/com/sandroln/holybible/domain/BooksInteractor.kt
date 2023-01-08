package com.sandroln.holybible.domain

import com.sandroln.holybible.data.BooksDataToDomainMapper
import com.sandroln.holybible.data.BooksRepository

interface BooksInteractor {

    suspend fun fetchBooks(): BookDomain

    class Base(
        private val booksRepository: BooksRepository,
        private val mapper: BooksDataToDomainMapper
    ) : BooksInteractor {
        override suspend fun fetchBooks() = booksRepository.fetchBooks().map(mapper)
    }
}