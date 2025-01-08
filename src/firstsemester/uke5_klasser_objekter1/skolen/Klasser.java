package firstsemester.uke5_klasser_objekter1.skolen;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

class Bok{

    public String tittel;
    public String forfatter;
    public double pris;

    public double regnUtRabatt(double prosent){
        double rabatt = pris*(prosent/100);
        return rabatt;
        //kan også sette rabatten direkte her uten å returnere den
        //altså oppdatere prisen direkte her med pris = pris- rabatt
    }

    public void skrivUtBok(){
        String ut= " her er informasjonen om boka: \n";
        ut += "Tittel: "+ tittel + "\n";
        ut += "Forfatter: "+forfatter+"\n";
        ut += "Pris: "+ pris + "\n";
        showMessageDialog(null,ut);
    }

}

public class Klasser {

    public static void main(String[] args) {

        String tittel = showInputDialog("Skriv inn tittel");
        String forfatter = showInputDialog(" Skriv inn forfatter");
        String innpris = showInputDialog(" Skriv inn pris");
        double pris = Double.parseDouble(innpris);
        //oprett boken
        Bok bok1 = new Bok();
        bok1.tittel = tittel;
        bok1.forfatter = forfatter;
        bok1.pris = pris;
        String person = showInputDialog("Ansatt eller student");

        if (person.equals("Student") ){
            double rabatt = bok1.regnUtRabatt(15);
            bok1.pris =bok1.pris - rabatt;

        }

        bok1.skrivUtBok();


    }

}
