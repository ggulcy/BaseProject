package com.chanhypark.baseproject

import com.chanhypark.baseproject.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
) : BaseViewModel() {

    suspend fun test() {

    }
}