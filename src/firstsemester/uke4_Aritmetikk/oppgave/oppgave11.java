package firstsemester.uke4_Aritmetikk.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave11 {
    /*
    Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen). F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13.
    Tips: 751 % 10 = 1 og 751 / 10 = 75.
     */

    public static void main(String[] args) {

        Integer tall= Integer.parseInt(showInputDialog("Skriv inn et tall mellom 0 og 1000"));
        Integer firsttall= tall%10;
        Integer secondtall = (tall/10)%10;
        Integer tredjetall = tall/100;
        Integer summenAvSif = firsttall+secondtall+tredjetall;

        String ut= "Tall er: " + tall +"\n" +
                    "summen av sifrene i tallet = "+tredjetall+" + " +secondtall + " + " + firsttall + " = " + summenAvSif;

        showMessageDialog(null,ut);



    }
}
