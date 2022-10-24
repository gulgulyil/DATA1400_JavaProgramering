package firstsemester.uke6_klasser_objektor.oppgaver.oppgave5;

import static javax.swing.JOptionPane.*;

//  Attributtene for kontoinnehavers navn, kontornummer og saldo.

//  Kontruktør som skal gi startverdier til ALLE attributtene

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */



// end of class Konto


class Konto1 {

    private String kontoNavn;
    private String kontoNummer;
    private double kontoSaldo;

    public Konto1(String kontoNavn, String kontoNummer, double kontoSaldo) {
        this.kontoNavn = kontoNavn;
        this.kontoNummer = kontoNummer;
        this.kontoSaldo = kontoSaldo;
    }

    public void kontoUtSkrift() {
        String ut = "Konto navn= " + kontoNavn + "\n" +
                "Konto Nuummer= " + kontoNummer + "\n" +
                "Konto Saldo= " + String.format("%.2f", kontoSaldo) + "\n";

        showMessageDialog(null, ut);
    }

    public String beløpKonto(double beløp) {
        kontoSaldo+=beløp;
        return "Den nye saldoen" + String.format("%.2f", beløp);
    }

    public String utBeløp(double beløp) {
        String Ut=" ";
        beløp = Double.parseDouble(showInputDialog("Skriv inn utbeløp"));
        if (kontoSaldo >= beløp) {
            kontoSaldo -= beløp;
            Ut="Den nye saldoen" + String.format("%.2f", kontoSaldo);

        } else {
             Ut = "Du har ikke nok saldoen";

        }
        return Ut;
    }
}



    public class Konto{
        public static void main(String[] args) {
           String kontonavn=showInputDialog("Angi kontonavn");
           String kontonr=showInputDialog("Angi kontonummer");
           double saldo=Double.parseDouble(showInputDialog("Angi saldo:"));
           Konto1 sparekonto= new Konto1(kontonavn,kontonr,saldo);
            System.out.println(sparekonto.beløpKonto(1000));
            System.out.println(sparekonto.utBeløp(100));
            System.out.println(sparekonto);
            sparekonto.kontoUtSkrift();


        }
    }


