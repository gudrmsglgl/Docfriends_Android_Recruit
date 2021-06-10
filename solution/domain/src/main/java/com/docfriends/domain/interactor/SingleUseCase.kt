package com.docfriends.domain.interactor

import com.docfriends.domain.executor.PostExecutionThread
import com.docfriends.domain.executor.ThreadExecutor
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

abstract class SingleUseCase<Result, in Param>
constructor(
    private val threadExecutor: ThreadExecutor,
    private val postExecutionThread: PostExecutionThread
) : UseCase<Result, Param> {

    override var disposables: CompositeDisposable = CompositeDisposable()

    abstract fun buildUseCase(param: Param? = null): Single<Result>

    override fun execute(
        onSuccess: (Result) -> Unit,
        onError: (Throwable) -> Unit,
        afterFinished: () -> Unit,
        onComplete: () -> Unit,
        params: Param?
    ) {
        buildUseCase(params)
            .subscribeOn(Schedulers.from(threadExecutor))
            .observeOn(postExecutionThread.scheduler)
            .doAfterTerminate(afterFinished)
            .subscribe(onSuccess, onError)
            .also {
                addDisposable(it)
            }
    }
}