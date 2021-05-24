package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Rules
 *Predsytavuje zoznam pravidiel pre hru Kerm.
 * @constructor Create empty Rules
 */
class Rules : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rules)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * Rulesmenu
     *Návrat do hlavného menu.
     * @param v parameter pre tlačidlo.
     */
    fun rulesmenu(v: View){
        setContentView(R.layout.activity_main)
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}