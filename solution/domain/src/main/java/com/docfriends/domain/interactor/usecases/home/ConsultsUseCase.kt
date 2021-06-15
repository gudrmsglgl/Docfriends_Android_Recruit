package com.docfriends.domain.interactor.usecases.home

import com.docfriends.domain.executor.PostExecutionThread
import com.docfriends.domain.executor.ThreadExecutor
import com.docfriends.domain.interactor.SingleUseCase
import com.docfriends.domain.interactor.repository.Repository
import com.docfriends.domain.model.TotalConsult
import io.reactivex.Single
import javax.inject.Inject

class ConsultsUseCase
@Inject constructor(
    private val repository: Repository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread
) : SingleUseCase<TotalConsult, Nothing>(threadExecutor, postExecutionThread) {

    override fun buildUseCase(param: Nothing?): Single<TotalConsult> {
        return repository.requestConsults()
    }

}