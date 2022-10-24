package firstsemester.uke5_klasser_objekter1.oppgaver;

class Kalkulator{

    public static double addere(double tall1, double tall2){
        double adderen= tall1+tall2;
        System.out.println("Adderen = "+tall1+" + "+tall2+" = "+adderen);
        return adderen;
    }

    public static double subtrahere(double tall1, double tall2){
        double subtrahere= tall1-tall2;
        System.out.println("Subtrahere = "+tall1+" - "+tall2+" = "+subtrahere);
        return subtrahere;
    }

    public static double multiplisere(double tall1,double tall2){
        double multiplisere= tall1*tall2;
        System.out.println("Multiplisere = "+tall1+" x "+tall2+" = "+multiplisere);
        return multiplisere;
    }

    public static double divididere(double tall1,double tall2){
        double dividere= tall1/tall2;
        System.out.println("Dividere = "+tall1+" + "+tall2+" = "+dividere);
        return dividere;
    }
}

 /*
    Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
     Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
     */

public class oppgave5 {

    public static void main(String[] args) {
        double addere=Kalkulator.addere(20,30);
        double subtrahere=Kalkulator.subtrahere(50,13);
        double multiplisere=Kalkulator.multiplisere(3,87);
        double diivdere=Kalkulator.divididere(87,5);
    }

}
