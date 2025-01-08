package firstsemester.uke7.AndreOppgaver;

import static javax.swing.JOptionPane.*;
/*Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer. Programmet skal lese inn to og to verdier,
lengden på turen i km og hvor mye bensin som ble brukt. Les inn ved hjelp av inputbokser (JOptionPane).
Når lengden på turen er 0 eller negativ avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.
 */

public class oppgave1 {
    public static void main(String[] args) {
        double brukBensin;
        double lengdenTur;
        double gjennomsnitt=0;
        double sumGjennomsnitt=0;

        do {
             brukBensin = Double.parseDouble(showInputDialog("Skriv inn at hvor mye bensin ble brukt"));
             lengdenTur = Double.parseDouble(showInputDialog("Skriv inn at hvor lengden på turen i km."));

             if(lengdenTur>0 && brukBensin>0) {
                 gjennomsnitt = (double) (brukBensin / lengdenTur);
                 sumGjennomsnitt += gjennomsnitt;
                 System.out.println(String.format("%0.2f",gjennomsnitt));
             }

        } while(lengdenTur>0 || brukBensin>0);

        String utt = "Gjennomsnitt av bensin er : " +String.format("%0.2f",sumGjennomsnitt);
        showMessageDialog(null, utt);


    }
}
