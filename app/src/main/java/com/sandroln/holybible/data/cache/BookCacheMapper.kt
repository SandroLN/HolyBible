package com.sandroln.holybible.data.cache

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book

interface BookCacheMapper : Abstract.Mapper {

    fun map(bookDb: BookDb): Book

    class Base : BookCacheMapper {
        override fun map(bookDb: BookDb) = Book(bookDb.id, bookDb.name)
    }
}