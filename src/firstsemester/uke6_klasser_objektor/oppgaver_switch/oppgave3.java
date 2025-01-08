package firstsemester.uke6_klasser_objektor.oppgaver_switch;

/*
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave3 {
    public static void main(String[] args) {

        int alder= Integer.parseInt(showInputDialog("Skriv inn alder"));
        if(alder<18){
            String ut="Du er for ung til å ta førerkort for bil" ;
            showMessageDialog(null,ut);
        }

        else{
            String ut= "Du kan ta førerkortet for bil da du er gammel nok";
            showMessageDialog(null,ut);
        }
    }
}
