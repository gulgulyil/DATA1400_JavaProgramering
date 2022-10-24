package firstsemester.uke3.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave4 {
    /*
    Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst i input-boksene.
    Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.
     */

    public static void main(String[] args) {

        String inntall1,inntall2,inntall3;
        inntall1=showInputDialog("Skriv første tall");
        inntall2=showInputDialog("Skriv andre tall");
        inntall3= showInputDialog("Skriv tredje tall");

        Double tall,tall1,tall2,tall3,gjnsnitt;


        gjnsnitt=0.0;

        try {

            tall1=Double.parseDouble(inntall1);
            tall2=Double.parseDouble(inntall2);
            tall3=Double.parseDouble(inntall3);
            gjnsnitt = (tall1 + tall2 + tall3) / 3;

        }

        catch (Exception e){

            tall=0.0;
        }

        showMessageDialog(null,gjnsnitt);
        System.out.println(gjnsnitt);

    }
}
