package com.sandroln.holybible.core

import android.app.Application
import com.sandroln.holybible.data.BooksRepository
import com.sandroln.holybible.domain.BaseBooksDataToDomainMapper
import com.sandroln.holybible.domain.BooksInteractor

class BibleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val booksRepository: BooksRepository = TODO("merge")
        val booksInteractor = BooksInteractor.Base(booksRepository, BaseBooksDataToDomainMapper())
    }
}