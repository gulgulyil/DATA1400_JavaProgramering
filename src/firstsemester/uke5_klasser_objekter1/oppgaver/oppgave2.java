package firstsemester.uke5_klasser_objekter1.oppgaver;

import javax.swing.*;


    /*
    Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.
     */

class Bøker2{
        String tittel;
        String forfatter;
        double pris;
        String IsbnNummer;

public void skriveut(){

        String ut="Tittelen er "+tittel+"\n"+
        "Forfatteren er "+forfatter+"\n"+
        "prisen er "+pris+"\n"+
        "ISBN nummer er "+IsbnNummer+"\n";
        System.out.println(ut);
    JOptionPane.showMessageDialog(null,ut);

        }
}

public class oppgave2 {

    public static void main(String[] args) {
        Bøker2 bøk2= new Bøker2();
        bøk2.tittel= JOptionPane.showInputDialog("Skriv tittelen til boka");
        bøk2.forfatter=JOptionPane.showInputDialog("Skriv forfatteren til boka");
        bøk2.pris=Integer.parseInt(JOptionPane.showInputDialog("Skriv prisen til boka"));
        bøk2.IsbnNummer=JOptionPane.showInputDialog("Skriv numberen til boka");
        bøk2.skriveut();
    }

}
