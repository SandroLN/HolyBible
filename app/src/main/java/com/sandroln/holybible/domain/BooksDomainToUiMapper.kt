package com.sandroln.holybible.domain

import com.sandroln.holybible.core.Abstract
import com.sandroln.holybible.core.Book
import com.sandroln.holybible.presentation.BooksUi

interface BooksDomainToUiMapper : Abstract.Mapper {
    fun map(books: List<Book>): BooksUi
    fun map(errorType: ErrorType): BooksUi
}