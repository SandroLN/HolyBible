package com.sandroln.holybible.data.cache

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class BookDb : RealmObject(), Abstract.Mapable<Book, BookCacheMapper> {
    @PrimaryKey
    var id: Int = -1
    var name: String = ""

    override fun map(mapper: BookCacheMapper) = Book(id, name)
}