package firstsemester.uke4_Aritmetikk.oppgave;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class oppgave4 {

    /*
    Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. Regn så ut  omkretsen av sirkelen
    (2*3.14*radius) og skriver ut svaret på følgende måte: ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.
     */

    public static void main(String[] args) {

    String radiusen = JOptionPane.showInputDialog("Skriv inn radiusen til sirkelen");
    Double radiusenS = Double.parseDouble(radiusen);
    Double omkretsen = 2*3.14*radiusenS;

    String ut= "Omkretsen av en sirkel med " + radiusenS + " cm som radius blir " +(String.format ("%.2f",omkretsen ))+ " cm.";
    /* double omkretseni virgulden sonra iki basamak yazdirmak icin String.format(%.2f, navn) kullanilir
     Ya da
     String omkrentsFormatToDesimaler=String.format("%.2f",omkretsen);
     */
    JOptionPane.showMessageDialog(null,ut);

    }
}
