package firstsemester.uke2class;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave3 {
    /*
    Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i flere inputbox'er og skriv det ut i en setning
    f.eks : Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Ole’s alder er 21 år.
     */

    public static void main (String [] args)
    {
        String innNavnet = JOptionPane.showInputDialog("Skriv inn navnet");
        String innEtternavnet = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen");
        String innAdresse= JOptionPane.showInputDialog("Skriv inn adresse");
        String innPostSted= JOptionPane.showInputDialog("Skriv inn byen");
        String innPostNr= JOptionPane.showInputDialog("Skriv inn postnummeren");
        String ut = innNavnet +" " + innEtternavnet + " bor i "+ innAdresse + " som har postnummer " + innPostNr + " i "
                + innPostSted +" "+innNavnet + "'s alder er "+ innAlder+ " år.";
        showMessageDialog(null,ut);



    }

}
