package com.example.semestralka

/**
 * Kocka
 *Predstavuje samotnú kocku a pamätá si posledné hodené číslo a počet hrán kocky.
 * @constructor
 */
class Kocka (){
    var pocetHran = 0;
    private var cislo: Int = 0;

    /**
     * Roll
     *Predstavuje hod kockou od 1 po pocet hran.
     */
    fun roll(){
       cislo =  (1..pocetHran).random();
    }

    /**
     * Get cislo
     *Geter na posledne cislo, ktoré padlo na kocke.
     * @return
     */
    fun getCislo(): Int {
        return cislo;
    }

    /**
     * Set pocet h
     *Seter na pocet hran.
     * @param h predstavuje pocet hran kocky.
     */
    fun setPocetH(h:Int){
        pocetHran = h
    }
}