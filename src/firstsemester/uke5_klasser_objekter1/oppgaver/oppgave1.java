package firstsemester.uke5_klasser_objekter1.oppgaver;
/*
   Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:

tittel
pris
forfatter
iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.

*/
class Bøker {
    String tittel;
    String forfatter;
    double pris;
    String IsbnNummer;

    public void skriveut(){

        String ut="Tittelen er "+tittel+"\n"+
                  "Forfatteren er "+forfatter+"\n"+
                  "prisen er "+pris+"\n"+
                  "ISBN nummer er "+IsbnNummer+"\n";
        System.out.println(ut);

    }
}

public class oppgave1 {
    public static void main(String[] args) {
        Bøker bok1=new Bøker();
        bok1.tittel="Harry Potter";
        bok1.forfatter="J. K. Rowling";
        bok1.pris=200;
        bok1.IsbnNummer="AB1234354";

        bok1.skriveut();

        }


}

