package com.newgamesoftware.moviesappdemo.base


import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.newgamesoftware.moviesappdemo.services.RootWebService
import com.newgamesoftware.moviesappdemo.subviews.ProgressView

abstract class BaseActivity: AppCompatActivity() {

    private val progressView by lazy { ProgressView(context = this) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (window.decorView as FrameLayout).apply {
            addView(progressView)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.attributes.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        }
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && progressView.isShowingProgress) {
            return true        // Progress gösteriliyorken geri tuşu tıklanmasın
        }

        return super.onKeyDown(keyCode, event)
    }


    val webService = RootWebService().apply {
        messageListener = ::showMessage
    }


    fun showMessage(text: String) {
        hideProgress()
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }


    fun showProgress() {
        progressView.show()
    }


    fun hideProgress() {
        progressView.hide()
    }
}