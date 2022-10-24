package firstsemester.uke3.oppgave;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    /*
    Lag et program som leser inn tre desimaltall. Programmet skal så summere disse tallene og vise summen i System.out.
     */

    public static void main(String[] args) {
        String inntall1,inntall2,inntall3;
        inntall1= showInputDialog("Skriv førte tall");
        inntall2= showInputDialog("Skriv andre tall");
        inntall3=showInputDialog("Skriv tredje tall");

        double tall1=Double.parseDouble(inntall1);
        double tall2=Double.parseDouble(inntall2);
        double tall3=Double.parseDouble(inntall3);
         double sum= tall1+tall2+tall3;
        System.out.printf("Det blir sammen sonn "+sum);
    }
}
