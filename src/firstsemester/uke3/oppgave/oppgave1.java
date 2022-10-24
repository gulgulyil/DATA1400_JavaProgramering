package firstsemester.uke3.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    /*Lag et program som leser inn alderen din (et heltall). Vis så denne i en meldingsbox sammen med en tekst
    f.eks som ”Min alder er 19 år.”
     */

    public static void main(String[] args) {
        String alder= showInputDialog("Skriv inn alderen din");
        int innalder= Integer.parseInt(alder);
        showMessageDialog(null,"Min alder er "+innalder+ " år.");
    }
}
