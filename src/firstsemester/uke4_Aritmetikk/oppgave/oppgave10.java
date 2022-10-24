package firstsemester.uke4_Aritmetikk.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave10 {
    /*
    Lag et program som leser inn et heltall, alder. Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :
    ”Du kan ta førerkortet for bil da du er gammel nok” eller ”Du er for ung til å ta førerkort for bil”. Gjør dette ved bruk to if-setninger.
     */

    public static void main(String[] args) {

        Integer alder= Integer.parseInt(showInputDialog("Skriv inn alder"));

        if (alder>=18){

            String ut="Du kan ta førerkortet for bil da du er gammel nok";
            showMessageDialog(null,ut);
        }

        else{

            String ut= "Du er for ung til å ta færerkort for bil";
            showMessageDialog(null,ut);
        }

    }
}
