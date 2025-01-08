package firstsemester.uke7.AndreOppgaver;

import static javax.swing.JOptionPane.*;
/*
En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
 Bruk inputbokser og avslutt innlesningen når prisen er 0.
 */

public class oppgave2 {
    public static void main(String[] args) {
        String innVarePris=showInputDialog("Skriv inn prisen på varen og avslutt med 0");
        double varePris= Double.parseDouble(innVarePris);
        double totalPris=0;
        while(varePris>0){
            totalPris+=varePris;
            innVarePris=showInputDialog("Skriv inn prisen på varen og avslutt med 0");
            varePris=Double.parseDouble(innVarePris);
        }
        double kommisjon = totalPris*0.09;
        showMessageDialog(null,"Komisjonen for totalt "+totalPris+" kr blir "+kommisjon+ " kr");
    }
}
