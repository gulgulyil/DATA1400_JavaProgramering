package firstsemester.uke2class;
import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    /*
    Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
     skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
     Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.
     */

    public static void main(String[] args) {
        String innNavn= JOptionPane.showInputDialog("Skriv inn navnet");
        String innEttterNavn= JOptionPane.showInputDialog("Skriv inn etternavnet");
        showMessageDialog(null,"Welcome the class "+innNavn+" "+innEttterNavn);

    }

}
