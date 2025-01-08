package firstsemester.uke7.AndreOppgaver;

import static javax.swing.JOptionPane.*;

/*
Et program skal finne det største tallet av 10 heltall. Tallene skal leses inn via Inputbokser og vises som en meldingsboks. Programmet skal bruke tre heltallsvariabler:
•	telller; som teller 0 til 10
•	nummer; som er tallet som er lest inn
•	størst; det til en hver tid største tallet

 */
public class oppgave4 {
    public static void main(String[] args) {
        int nummer;
        int størst=0;
        for(int teller=1; teller<=10; teller++){
            String innTall= showInputDialog("Skriv inn heltall nummer "+teller);
            nummer=Integer.parseInt(innTall);
            if(nummer>størst){
                størst=nummer;
            }
        }
        showMessageDialog(null,"Det største tallet er "+størst);
    }
}
