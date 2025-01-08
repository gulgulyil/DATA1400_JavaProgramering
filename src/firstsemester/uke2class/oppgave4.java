package firstsemester.uke2class;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave4 {
    /*
    Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):

Navn : Ole Olsen
Adresse : Osloveien 23
Postnummer : 0470
Poststed : Oslo
Alder : 21 år.
     */

    public static void main (String [] args)
    {
        String innNavnet = JOptionPane.showInputDialog("Skriv inn navnet");
        String innEtternavnet = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen");
        String innAdresse= JOptionPane.showInputDialog("Skriv inn adresse");
        String innPostSted= JOptionPane.showInputDialog("Skriv inn byen");
        String innPostNr= JOptionPane.showInputDialog("Skriv inn postnummeren");
        String ut = "Navnet : " + innNavnet + " "+  innEtternavnet +"\n"
                +   "Adresse: "+ innAdresse + "\n"
                +   "Postnummer : " + innPostNr + "\n"
                +   "Poststed : " + innPostSted +"\n"
                +   "Alder : " + innAlder+ " år.";
        showMessageDialog(null,ut);



    }
}
