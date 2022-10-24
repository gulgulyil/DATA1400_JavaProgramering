package firstsemester.uke6_klasser_objektor.oppgaver_switch;

import static javax.swing.JOptionPane.*;

/*
Les inn en heltallsvariabel "alder".
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :

”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.

Gjør dette uten bruk av en else-setning (bruk to if-setninger).
 */
public class oppgave2 {
    public static void main(String[] args) {

        int alder= Integer.parseInt(showInputDialog("Skriv inn alder"));

        if(alder<18){
            String ut="Du er for ung til å ta førerkort for bil" ;
            showMessageDialog(null,ut);
        }

        if(alder>=18){
           String ut= "Du kan ta førerkortet for bil da du er gammel nok";
           showMessageDialog(null,ut);
        }
    }
}
