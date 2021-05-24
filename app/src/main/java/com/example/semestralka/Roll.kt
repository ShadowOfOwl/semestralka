package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Roll
 *Predstavuje triedu pre rolovanie jednou kockou.
 * @constructor Create empty Roll
 */
class Roll : AppCompatActivity(){
    val k :Kocka = Kocka()
    var kocka: TextView? = null
    var pocetH:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roll)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        pocetH = this.getIntent().getIntExtra("pocetH",6);
        kocka = findViewById(R.id.textView4)
    }

    /**
     * Roll roll
     *Hod jednou kockou a vypísanie čísla.
     * @param v parameter pre tlačidlo.
     */
    fun rollRoll(v: View){
        k.setPocetH(pocetH)
        k.roll()
        kocka?.setText(k.getCislo().toString())
    }

    /**
     * Rollmenu
     *Návrat do hlavého menu.
     * @param v parameter pre tlačidlo.
     */
    fun rollmenu(v: View){
        setContentView(R.layout.activity_main)
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}