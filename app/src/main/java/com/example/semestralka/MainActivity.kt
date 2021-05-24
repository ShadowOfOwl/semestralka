package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


/**
 * Main activity
 *Predstavuje hlavé menu aplikácie.
 * @constructor Create empty Main activity
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * Play
     *Predstavuje zapnutie hry.
     * @param v parameter pre tlačidlo.
     */
    fun play(v: View){
        setContentView(R.layout.cubes)
        val i: Intent = Intent(this, Kocky::class.java)
        startActivity(i)
        finish()
    }

    /**
     * Rules
     *Predstavuje načítanie pravidiel.
     * @param v parameter pre tlačidlo.
     */
    fun rules(v: View){
        setContentView(R.layout.rules)
        val i: Intent = Intent(this, Rules::class.java)
        startActivity(i)
        finish()
    }

    /**
     * Roll
     *Predstavuje hadzanie jednou kockou.
     * @param v parameter pre tlačidlo.
     */
    fun roll(v: View){
        setContentView(R.layout.cubes2)
        val i: Intent = Intent(this, Kocky2::class.java)
        startActivity(i)
        finish()
    }

}
