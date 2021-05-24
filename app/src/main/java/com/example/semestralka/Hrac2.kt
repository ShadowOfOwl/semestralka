package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Hrac2
 *Predstavuje výťaznú obrazovku pre hráča 2.
 * @constructor Create empty Hrac2
 */
class Hrac2 : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hrac2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * H2menu
     *Návrat do hlavného menu z obrazovky.
     * @param v parameter pre tlačidlo.
     */
    fun h2menu(v: View){
        setContentView(R.layout.activity_main)
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}