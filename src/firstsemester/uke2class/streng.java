package firstsemester.uke2class;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class streng {

    public static void main(String[] args) {
        String navn, adresse;
        navn ="Per Hansen";
        adresse="Osleveien 82";
        String postAdresse= "Oslo";
        String postNr="0234";
        System.out.println("Navnet er : "+navn);
        System.out.println("Adressen er : "+adresse);
        System.out.println("Postadresse : "+postNr+" "+postAdresse);

        String innNavn = JOptionPane.showInputDialog("Skriv inn navnet");
        String InnAdrese = JOptionPane.showInputDialog("Skriv inn adressen");
        String InPostNr=  JOptionPane.showInputDialog("Skriv inn postnummer");
        String ut = innNavn + " "+ InnAdrese+ " "+InPostNr;
        System.out.println(ut);
    }
}
