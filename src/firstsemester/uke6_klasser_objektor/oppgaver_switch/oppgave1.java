package firstsemester.uke6_klasser_objektor.oppgaver_switch;
import static javax.swing.JOptionPane.*;
/*
Les inn en heltallsvariabel. Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet”.
Dvs. at du må ha en beslutning som tester på om alderen eller mellom 18 og 20. Dersom dette ikke er tilfelle skriv ut
 ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.
 */

public class oppgave1 {
    public static void main(String[] args) {
        int alder= Integer.parseInt(showInputDialog("Skriv inn alderen"));

        if(20>=alder && 18<=alder){
            String ut="Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet";
            showMessageDialog(null,ut);
        }

        else {
            String ut="Du er enten umyndig eller så kan du kjøpe hva du vil på polet";
            showMessageDialog(null,ut);
         }
    }
}
