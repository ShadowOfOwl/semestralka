package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Hrac1
 *Predstavuje výťaznú obrazovku pre hráča 1.
 * @constructor Create empty Hrac1
 */
class Hrac1 : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hrac1)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * H1menu
     *Návrat do hlavného menu z obrazovky.
     * @param v parameter pre tlačidlo.
     */
    fun h1menu(v: View){
        setContentView(R.layout.activity_main)
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}