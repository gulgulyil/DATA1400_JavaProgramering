package firstsemester.uke6_klasser_objektor.oppgaver;

import static javax.swing.JOptionPane.*;
/*
Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er stille
(mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).
Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).  Formelen for Beaufort er
: (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i. Bruk gjerne Math.pow funksjonen for å foreta beregningen.
Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.
Nedenfor illustreres hvordan klassen og metodene skal se ut:
 */

class Vind{

    private double vindHastighet = 0.0;

    public Vind(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindhastighet() {

        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet>=120){
          return true;
        }
        return false;
    }

    public boolean erVindstille() {
        if (vindHastighet<=2){
            return true;
        }
        return false;
    }

    public double getKnop() {
        double knop =vindHastighet/1.852;
        return knop;
    }

    public int getBeaufort() {
        int beaufort=(int)(Math.pow(vindHastighet/3.01,0.6666)+0.5);
        return beaufort;
    }

}

public class oppgave6 {
    public static void main(String[] args) {

        String innvind= showInputDialog("Anngi vind");
        double vind= Double.parseDouble(innvind);
        Vind sjekkvind= new Vind(vind);
        String ut="vindhastingen er "+sjekkvind.getVindhastighet()+"\n";
        if(sjekkvind.erOrkan()){
            ut+="Det er orkan.\n";
        }
        String knop=String.format("%.2f",sjekkvind.getKnop());
        ut+= "Det er "+knop+" knop.`\n";
        ut+="Og det tilsvarer "+sjekkvind.getBeaufort()+" på beufort-skalen";
        showMessageDialog(null,ut);
    }
}
