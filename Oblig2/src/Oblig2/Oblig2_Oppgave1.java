package Oblig2;

import static javax.swing.JOptionPane.*;

public class Oblig2_Oppgave1 {

    public static void main(String[] args){

        int tall1 = Integer.parseInt(showInputDialog("Du skal skrive to tall med det minste først. " +
                "Skriv inn det første tallet: "));
        int tall2 = Integer.parseInt(showInputDialog("Skriv inn det andre tallet"));
        int sum = 0;

        while(tall2 <= tall1) {
            showMessageDialog(null,"Det første tallet er større eller lik det andre." +
                    " Skriv inn tallene på nytt");
            tall1 = Integer.parseInt(showInputDialog("Du skal skrive to tall med det minste først. " +
                    " Skriv inn det første tallet: "));
            tall2 = Integer.parseInt(showInputDialog("Skriv inn det andre tallet"));
        }
        for(int i = tall1; i <= tall2; i++){
            sum += i;

          //  tall10 = i - tall1;
            if (i < tall2) {
                System.out.print(i + " + ");
            }
            else if (i == tall2){
                System.out.print( i + " = ");
            }
            if (i % 10 == 0 && i != tall1){
                System.out.println("\n");
            }

        }
        System.out.print(sum);
    }
}
