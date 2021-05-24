package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


/**
 * Kocky2
 *Predstavuje výber kocky, ktorá sa následne použije v rolle.
 * @constructor Create empty Kocky
 */
class Kocky2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cubes2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * Stiry2
     *Výber švorstenu.
     * @param v parameter pre tlačidlo.
     */
    fun stiry2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",4)
        startActivity(i)
        finish()
    }

    /**
     * Sest2
     *Výber kocky.
     * @param v parameter pre tlačidlo.
     */
    fun sest2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",6)
        startActivity(i)
        finish()
    }

    /**
     * Osem2
     *Výber osem hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun osem2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",8)
        startActivity(i)
        finish()
    }

    /**
     * Desat2
     *Výber desať hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun desat2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",10)
        startActivity(i)
        finish()
    }

    /**
     * Dvanast2
     *Výber dvanásť hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun dvanast2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",12)
        startActivity(i)
        finish()
    }

    /**
     * Dvadsat2
     *Výber dvadsať hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun dvadsat2(v: View){
        setContentView(R.layout.roll)
        val i: Intent = Intent(this, Roll::class.java)
        i.putExtra("pocetH",20)
        startActivity(i)
        finish()
    }
}