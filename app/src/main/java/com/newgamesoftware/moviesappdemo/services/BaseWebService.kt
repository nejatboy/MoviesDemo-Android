package com.newgamesoftware.moviesappdemo.services

import com.google.gson.Gson
import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import kotlin.coroutines.CoroutineContext

abstract class BaseWebService: CoroutineScope {

    private val job = Job()
    override val coroutineContext: CoroutineContext get() = job + Dispatchers.IO
    val baseURL = "http://api.themoviedb.org/"
    val apiKey = "d53aec0276d4b68b29114b8ead2b66fc"
    val gson = Gson()
    var messageListener: ((error: String) -> Unit)? = null


    protected inline fun <reified T>fire(connection: HttpURLConnection, crossinline completion: (T) -> Unit) {
        launch {
            runCatching {
                connection.apply {
                    try {
                        connect()

                        val inputStream = if (responseCode == 200) inputStream else errorStream
                        val json = BufferedReader(InputStreamReader(inputStream)).readLine()
                        val model = gson.fromJson(json, T::class.java)

                        withContext(Dispatchers.Main){
                            completion.invoke(model)
                        }
                    }

                    catch (e: Exception) {
                        e.printStackTrace()
                    }

                    finally {
                        inputStream.close()
                        disconnect()
                    }
                }
            }
        }
    }
}