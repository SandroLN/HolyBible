package com.sandroln.holybible.data

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book
import com.sandroln.holybible.domain.BookDomain

interface BooksDataToDomainMapper : Abstract.Mapper {
    fun map(books: List<Book>): BookDomain
    fun map(e: Exception): BookDomain
}