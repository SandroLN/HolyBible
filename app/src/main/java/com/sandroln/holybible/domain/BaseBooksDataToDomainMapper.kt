package com.sandroln.holybible.domain

import com.sandroln.holybible.core.Book
import com.sandroln.holybible.data.BooksDataToDomainMapper

class BaseBooksDataToDomainMapper : BooksDataToDomainMapper {

    override fun map(books: List<Book>) = BookDomain.Success(books)
    override fun map(e: Exception) = BookDomain.Fail(e)
}