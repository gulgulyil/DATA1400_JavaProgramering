package firstsemester.uke4_Aritmetikk.oppgave;

import javax.swing.*;
import javax.swing.JOptionPane.*;

public class oppgave3 {

    /*
    Lag et program som regner ut arealet av et rektangel. Programmet skal lese inn lengden og bredden på rektangelet.
    Regn så ut  arealet og skriver ut svaret på følgende måte:
     ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.
     */

    public static void main(String[] args) {
        String lengden, bredden;
        lengden = JOptionPane.showInputDialog("Skriv lengden av rektangelen");
        bredden= JOptionPane.showInputDialog("Skriv bredden av rektangelen");
        Integer breddenR= Integer.parseInt(bredden);
        Integer lengdenR= Integer.parseInt(lengden);

        Integer areal= breddenR*lengdenR;

        String ut= " Et rektangel med bredde " + bredden + " cm. og lengdde " + lengden + " cm. har et areal på " + areal
                + " cm2";

        JOptionPane.showMessageDialog(null,ut);


    }
}
