package com.sandroln.holybible.data.cache

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book

interface BooksCacheMapper : Abstract.Mapper {

    fun map(books: List<BookDb>): List<Book>

    class Base(private val mapper: BookCacheMapper) : BooksCacheMapper {
        override fun map(books: List<BookDb>) = books.map { bookDb ->
            bookDb.map(mapper)
        }
    }
}