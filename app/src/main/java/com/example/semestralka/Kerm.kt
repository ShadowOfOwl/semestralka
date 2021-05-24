package com.example.semestralka

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


/**
 * Kerm
 *Predstavuje samotnú hru Kerm s 2 hráčmi poľa pravidiel vypísaných v Game Rules
 * @constructor Create empty Kerm
 */
class Kerm() : AppCompatActivity(){
    var scoreh1: TextView? = null
    var scoreh2: TextView? = null
    var cislo1h1: TextView? = null
    var cislo2h1: TextView? = null
    var cislo3h1: TextView? = null
    var cislo1h2: TextView? = null
    var cislo2h2: TextView? = null
    var cislo3h2: TextView? = null
    var hrac:Boolean = true;
    var roll2:Boolean = true;
    var pocetH: Int =6;
    var hrac1:Hrac = Hrac()
    var hrac2:Hrac = Hrac()

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kerm)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        scoreh1 = findViewById(R.id.textView14)
        scoreh2 = findViewById(R.id.textView21)
        cislo1h1 = findViewById(R.id.textView13)
        cislo2h1 = findViewById(R.id.textView16)
        cislo3h1 = findViewById(R.id.textView17)
        cislo1h2 = findViewById(R.id.textView20)
        cislo2h2 = findViewById(R.id.textView19)
        cislo3h2 = findViewById(R.id.textView18)
        pocetH = this.getIntent().getIntExtra("pocetH",6);
    }


    /**
     * Roll1
     *Predstavuje hod tretej kocky pre oboch hráčov podľa toho kto je na rade.
     * @param v parameter pre tlačidlo.
     */
    fun roll1(v:View){
        hrac1.setpoceth(pocetH)
        hrac2.setpoceth(pocetH)
        if(!roll2){
            if(hrac){
                hrac1.roll1();
                cislo3h1?.setText(hrac1.getcislo3().toString())
                hrac1.kontrola();
                scoreh1?.setText(hrac1.getscore().toString())
                if(hrac1.getscore().equals(10)){
                    setContentView(R.layout.hrac1)
                    val i: Intent = Intent(this, Hrac1::class.java)
                    startActivity(i)
                    finish()
                }
                hrac = false;
            }else{
                hrac2.roll1();
                cislo3h2?.setText(hrac2.getcislo3().toString())
                hrac2.kontrola()
                scoreh2?.setText(hrac2.getscore().toString());
                if(hrac2.getscore().equals(10)){
                    setContentView(R.layout.hrac2)
                    val i: Intent = Intent(this, Hrac2::class.java)
                    startActivity(i)
                    finish()
                }
                hrac = true;
            }
            roll2=true;
        }
    }

    /**
     * Roll2
     *Predstavuje hod prvých dvoch kociek podľa toho kto je na rade.
     * @param v parameter pre tlačidlo.
     */
    fun roll2(v:View){
        hrac1.setpoceth(pocetH)
        hrac2.setpoceth(pocetH)
        if(roll2){
            if(hrac){
                hrac1.roll2();
                cislo1h1?.setText(hrac1.getcislo1().toString())
                cislo2h1?.setText(hrac1.getcislo2().toString())
            }else{
                hrac2.roll2();
                cislo1h2?.setText(hrac2.getcislo1().toString())
                cislo2h2?.setText(hrac2.getcislo2().toString())
            }
            roll2=false;
        }
    }

    /**
     * Menu
     *Predstavuje návrat do menu.
     * @param v parameter pre tlačidlo.
     */
    fun menu(v: View){
        setContentView(R.layout.activity_main)
        val i: Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
}