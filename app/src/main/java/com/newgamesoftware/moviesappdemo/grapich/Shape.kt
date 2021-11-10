package com.newgamesoftware.moviesappdemo.grapich

import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable

object Shape {

    fun states(normalColor: Int, pressedColor: Int) : StateListDrawable {
        val normal = GradientDrawable().apply {
            setColor(normalColor)
        }

        val pressed = GradientDrawable().apply {
            setColor(pressedColor)
        }

        return StateListDrawable().apply {
            setExitFadeDuration(300)
            setEnterFadeDuration(300)
            addState(intArrayOf(android.R.attr.state_pressed), pressed)
            addState(intArrayOf(- android.R.attr.state_pressed), normal)
        }
    }
}