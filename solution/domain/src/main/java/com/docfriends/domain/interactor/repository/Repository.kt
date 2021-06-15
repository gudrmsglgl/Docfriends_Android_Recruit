package com.docfriends.domain.interactor.repository

import com.docfriends.domain.model.TotalConsult
import io.reactivex.Single

interface Repository {
    fun requestConsults(): Single<TotalConsult>
}