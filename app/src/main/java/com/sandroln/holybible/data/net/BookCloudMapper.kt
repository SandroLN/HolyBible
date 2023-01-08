package com.sandroln.holybible.data.net

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book

interface BookCloudMapper : Abstract.Mapper {

    fun map(id: Int, name: String): Book

    class Base : BookCloudMapper {
        override fun map(id: Int, name: String) = Book(id, name)
    }
}