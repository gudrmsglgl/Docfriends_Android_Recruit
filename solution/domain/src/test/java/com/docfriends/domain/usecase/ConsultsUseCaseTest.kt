package com.docfriends.domain.usecase

import com.docfriends.domain.BaseDomainTest
import com.docfriends.domain.interactor.usecases.home.ConsultsUseCase
import com.docfriends.domain.model.TotalConsult
import com.docfriends.domain.test.factory.TotalConsultFactory
import io.mockk.every
import io.mockk.verify
import io.reactivex.Single
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ConsultsUseCaseTest : BaseDomainTest<Single<TotalConsult>, Nothing>() {

    private lateinit var consultsUseCase: ConsultsUseCase

    @BeforeEach
    fun setUseCase() {
        consultsUseCase = ConsultsUseCase(repository, threadExecutor, postExecutionThread)
    }

    @Test
    fun buildUseCaseCallRepositoryFunc(){
        stubRepositoryRetValue(TotalConsultFactory.createTotalConsult())

        whenBuildUseCase()
            .test()

        verify {
            repository.requestConsults()
        }
    }

    @Test
    fun buildUseCaseRxObservableComplete(){
        stubRepositoryRetValue(TotalConsultFactory.createTotalConsult())

        whenBuildUseCase()
            .test()
            .assertComplete()
    }

    @Test
    fun buildUseCaseRepoFuncReturnTotalConsult(){
        val totalConsult = TotalConsultFactory.createTotalConsult()
        stubRepositoryRetValue(totalConsult)

        whenBuildUseCase()
            .test()
            .assertValue(totalConsult)
    }

    private fun stubRepositoryRetValue(stubValue: TotalConsult) {
        every { repository.requestConsults() } returns Single.just(stubValue)
    }

    override fun whenBuildUseCase(param: Nothing?): Single<TotalConsult> {
        return repository.requestConsults()
    }

}