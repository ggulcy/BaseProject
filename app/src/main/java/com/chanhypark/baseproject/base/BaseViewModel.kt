package com.chanhypark.baseproject.base
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext


@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() , CoroutineScope {

    private val job: Job = SupervisorJob()
    override val coroutineContext: CoroutineContext
    get() = Dispatchers.Default + job

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}