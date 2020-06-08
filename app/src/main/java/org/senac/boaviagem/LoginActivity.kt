package org.senac.boaviagem

import android.support.v7.app.AppCompatActivity
import android.support.v4.content.ContextCompat
import android.os.Bundle
import android.os.Build
import android.support.annotation.ColorInt
import android.support.annotation.RequiresApi
import android.view.Window
import android.view.WindowManager

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.setStatusBarColorTo(R.color.colorPrimaryDark)
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)

    fun Window.setStatusBarColorTo(color: Int){
        this.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        this.statusBarColor = ContextCompat.getColor(baseContext, color)
    }


}