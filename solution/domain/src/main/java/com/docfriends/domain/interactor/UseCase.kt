package com.docfriends.domain.interactor

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

interface UseCase<Result, in Param> {
    var disposables: CompositeDisposable

    fun execute(
        onSuccess: (Result) -> Unit,
        onError: (Throwable) -> Unit,
        afterFinished: () -> Unit = {},
        onComplete: () -> Unit = {},
        params: Param?
    )

    fun dispose() {
        if (!disposables.isDisposed) disposables.dispose()
    }

    fun addDisposable(disposable: Disposable) {
        if (disposables.isDisposed) {
            disposables = CompositeDisposable()
        }
        disposables.add(disposable)
    }

}