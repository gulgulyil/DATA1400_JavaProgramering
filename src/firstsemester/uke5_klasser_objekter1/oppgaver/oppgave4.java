package firstsemester.uke5_klasser_objekter1.oppgaver;
import javax.swing.*;

import static  javax.swing.JOptionPane.*;

class Personn{
    String navn;
    String adresse;
    String telefonnr;
    Integer fødselår;

    public int regneUtAlder() {
        int alder = 2022 - fødselår;
        return alder;
    }

    /*
   Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
    */
    public void skriveUt(){
        String ut= "Navn : "+navn+"\n"+
                "Adresse  : "+adresse+"\n"+
                "Telefonnummer : "+ telefonnr+"\n"+
                "Alder : "+ regneUtAlder()+ " år.";
        JOptionPane.showMessageDialog(null,ut);
    }
}


public class oppgave4 {

    public static void main(String[] args) {
        Personn person1= new Personn();
        person1.navn=JOptionPane.showInputDialog("Skriv inn navnet ditt");
        person1.adresse=JOptionPane.showInputDialog("Skriv inn adresen din");
        person1.telefonnr=JOptionPane.showInputDialog("Skriv inn telefonnummer");
        person1.fødselår=Integer.parseInt(JOptionPane.showInputDialog("Skriv inn fødselsår"));

        person1.skriveUt();

    }

}



