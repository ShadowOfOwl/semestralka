package com.example.semestralka

/**
 * Hrac
 *Classa, ktorá predstavuje samotného hráča v hre.
 * Pamätá si hráčove score a jednotlivé kocky, ktoré hhráč používa.
 * @constructor
 */
class Hrac (){
    val k1:Kocka = Kocka();
    val k2:Kocka = Kocka();
    val k3:Kocka = Kocka();
    var score: Int = 0;

    /**
     * Roll1
     *Predstavuje hod 3. kockou.
     */
    fun roll1(){
        k3.roll();
    }

    /**
     * Roll2
     *Predstavuje hod prvými dvoma kockami.
     */
    fun roll2(){
        k1.roll();
        k2.roll();
    }

    /**
     * Getcislo1
     *Predstavuje geter na cislo z 1. kocky.
     * @return
     */
    fun getcislo1(): Int {
        return k1.getCislo();
    }

    /**
     * Getcislo2
     *Predstavuje geter na cislo z 2. kocky.
     * @return
     */
    fun getcislo2(): Int{
        return k2.getCislo();
    }

    /**
     * Getcislo3
     *Predstavuje geter na cislo z 3. kocky.
     * @return
     */
    fun getcislo3(): Int{
        return k3.getCislo();
    }

    /**
     * Getscore
     *Predstavuje geter na score hraca.
     * @return
     */
    fun getscore(): Int{
        return score;
    }

    /**
     * Pridaj
     *Pridava 1 bod ku hračovmu score.
     */
    fun pridaj(){
        score++;
    }

    /**
     * Kontrola
     *Kontrola, či číslo, ktoré padlo na 3. kocke pochádza z intervalu (číslo 1. kocky, číslo 2. kocky).
     */
    fun kontrola(){
        if(k3.getCislo()<k2.getCislo()&&k3.getCislo()>k1.getCislo()||k3.getCislo()>k2.getCislo()&&k3.getCislo()<k1.getCislo()){
            pridaj();
        }
    }
    /**
     * Set pocet h
     *Seter na pocet hran pre vsetky 3 kocky hraca.
     * @param h predstavuje pocet hran kocky.
     */
    fun setpoceth(h:Int){
        k1.setPocetH(h)
        k2.setPocetH(h)
        k3.setPocetH(h)
    }
}