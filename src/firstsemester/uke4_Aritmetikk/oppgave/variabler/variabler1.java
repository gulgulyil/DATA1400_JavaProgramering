package firstsemester.uke4_Aritmetikk.oppgave.variabler;

import static javax.swing.JOptionPane.*;

//oppgave8
public class variabler1 {

    public static void main(String[] args) {

        double tall1=1;
        double tall2=2;
        double resultat;
        resultat= tall1* 4 + (tall2 * 2 + tall1) / (tall2-tall1*3);
        // resultat = 1*4 + (2*2+1)/(2-1*3);
        // resultatet = 4 + (5/-1) = -1.0;

        System.out.println(resultat);
    }
}
