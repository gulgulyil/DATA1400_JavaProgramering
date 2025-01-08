package firstsemester.uke6_klasser_objektor.oppgaver_switch;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år). Oppdater oppgavene
over slik at programmet skriver ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker
 */
public class oppgave4 {

    public static void main(String[] args) {
        int alder= Integer.parseInt(showInputDialog("Skriv inn alder"));
        String ut="";

        if(alder<18){
            ut= "Du er for ung til å ta førerkort for bil" ;

        }else

        if(alder>=18 && alder<70){
            ut= "Du kan ta førerkortet for bil og du trenger ikke årlige legesjekker";

        }
        else{
            ut= "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker";
        }

        showMessageDialog(null,ut);
    }
}
