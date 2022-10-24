package firstsemester.uke6_klasser_objektor.oppgaver;

import static javax.swing.JOptionPane.*;

/*
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
 */

class Klokke{
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        setTime(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if( time<24 && time>=0) {
            this.time = time;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if(minutter<60 && minutter>=0) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(sekunder<60 && sekunder>=0) {
            this.sekunder = sekunder;
        }
    }

    public void visTiden (){

        String ut=time+ ":"+ minutter + ":" +sekunder;
            System.out.println(ut);
            showMessageDialog(null,ut);

    }
}
public class oppgave4 {
    public static void main(String[] args) {
        Klokke klokken = new Klokke(20,30,75);
        klokken.visTiden();
        Klokke klokken2= new Klokke(12,12,12);
        klokken2.visTiden();
    }
}
