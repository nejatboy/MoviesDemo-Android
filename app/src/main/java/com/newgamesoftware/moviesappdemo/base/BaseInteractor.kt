package com.newgamesoftware.moviesappdemo.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

abstract class BaseInteractor: CoroutineScope {

    override val coroutineContext: CoroutineContext get() = Dispatchers.Main


}