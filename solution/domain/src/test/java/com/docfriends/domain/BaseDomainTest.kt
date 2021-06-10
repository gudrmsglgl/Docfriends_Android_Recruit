package com.docfriends.domain

import com.docfriends.domain.executor.PostExecutionThread
import com.docfriends.domain.executor.ThreadExecutor
import com.docfriends.domain.interactor.repository.Repository
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
abstract class BaseDomainTest<Result, Param> {

    @MockK
    protected lateinit var repository: Repository
    @MockK
    protected lateinit var threadExecutor: ThreadExecutor
    @MockK
    protected lateinit var postExecutionThread: PostExecutionThread

    @BeforeEach
    fun mockSetup() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    abstract fun whenBuildUseCase(param: Param? = null): Result
}