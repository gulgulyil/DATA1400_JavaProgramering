package firstsemester.uke2class;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave2 {

     /*
    Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
     skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
     Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.
    Utvid oppgave 1 med å lese inn alderen.  Programmet skal så vise følgende i meldingsboksen (f.eks inndata):
     ”Alderen til Ole Olsen er 21 år.”
     */

    public static void main(String[] args) {
        String innNavn= JOptionPane.showInputDialog("Skriv inn navnet");
        String innEtterNavn= JOptionPane.showInputDialog("Skriv inn etternavn");
        String innAlder = JOptionPane.showInputDialog(" Skriv inn alderen");

        String ut= " Alderen til " + innNavn +" "+ innEtterNavn + " er "+ innAlder+ " år." ;
        showMessageDialog(null,ut);
    }
}
