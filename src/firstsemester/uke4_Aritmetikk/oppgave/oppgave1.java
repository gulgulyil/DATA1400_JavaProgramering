package firstsemester.uke4_Aritmetikk.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave1 {
    /*
    Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): Per Olsen er i dag 32 år. Han er født i 1986.
    I 2053 er han 67 år og da vil han være pensjonist.
(Tallene er utifra året 2018).
     */

    public static void main(String[] args) {
        String innNavn = showInputDialog("Skriv inn navnet");
        String innAlderen = showInputDialog("Skriv inn alderen");
        Integer alderen = Integer.parseInt(innAlderen);
        Integer fødtår= 2022-alderen;
        Integer persjonistår = fødtår + 67;
        String ut= innNavn + " er i dag "+alderen + " år. Hen er født i " + fødtår + " . I " + persjonistår + " " +
                "er han 67 år og da vil hen være pensjonist.";

        showMessageDialog(null,ut);

        System.out.println(ut);
    }
}
