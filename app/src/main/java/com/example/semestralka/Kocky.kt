package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


/**
 * Kocky
 *Predstavuje výber kocky, ktorá sa následne použije v hre.
 * @constructor Create empty Kocky
 */
class Kocky : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cubes)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    /**
     * Stiry
     *Výber švorstenu.
     * @param v parameter pre tlačidlo.
     */
    fun stiry(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",4)
        startActivity(i)
        finish()
    }

    /**
     * Sest
     *Výber kocky.
     * @param v parameter pre tlačidlo.
     */
    fun sest(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",6)
        startActivity(i)
        finish()
    }

    /**
     * Osem
     *Výber osem hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun osem(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",8)
        startActivity(i)
        finish()
    }

    /**
     * Desat
     *Výber desať hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun desat(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",10)
        startActivity(i)
        finish()
    }

    /**
     * Dvanast
     *Výber dvanásť hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun dvanast(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",12)
        startActivity(i)
        finish()
    }

    /**
     * Dvadsat
     *Výber dvadsať hrannej kocky.
     * @param v parameter pre tlačidlo.
     */
    fun dvadsat(v: View){
        setContentView(R.layout.kerm)
        val i: Intent = Intent(this, Kerm::class.java)
        i.putExtra("pocetH",20)
        startActivity(i)
        finish()
    }
}