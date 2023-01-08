package com.sandroln.holybible.data

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book
import com.sandroln.holybible.data.net.BookCloud
import com.sandroln.holybible.data.net.BookCloudMapper

interface BooksCloudMapper : Abstract.Mapper {

    fun map(cloudList: List<BookCloud>): List<Book>

    class Base(private val bookMapper: BookCloudMapper) : BooksCloudMapper {
        override fun map(cloudList: List<BookCloud>) = cloudList.map { bookCloud ->
            bookCloud.map(bookMapper)
        }
    }
}