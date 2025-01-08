package firstsemester.Eksamen.Programmering_2019_1;
/*
Det skal lages kode for en klasse kalt Skatt. Den skal ha følgende attributter
- navn (tekst)
- adresse (tekst)
- lønn (desimaltall)
- skatt (desimaltall)
Det også lages en metode i denne klassen som heter beregn. Denne metoden skal så beregne
skatten ut i fra lønnen etter følende formel:
Ved inntekter mindre enn 50.000 skal det ikke betales skatt.
Ved inntekter mellom 50.000 og 150.000 skal det betales 25% skatt på hele lønnen.
Inntekter over 150.000 skal det betales 35 % skatt på hele lønnen.
Metoden skal så sette den beregnede skatten i skatte-attributten. Det betyr at metoden ikke skal motta
noe eller returnere noe.
En metode toString() skal også lages. Denne skal formatere resultatet slik:
Per Hansen, Osloveien 82 0150 Oslo
Lønn : 400000.0 Skatt : 140000.0
Kod klassen og metodene under. Bruk en konstruktør. Det er ikke nødvendig å kode get/set-metoder.
Kod også kall til disse for å skrive resultatet til System.out.
 */

//import org.w3c.dom.ls.LSOutput;

class Skatt{

    public String navn;
    public String adresse;
    public double lønn;
    public double skatt;

    public void  beregn(){

        if(lønn<50000){
            skatt=0;
        }
        else if(lønn>50000 && lønn<150000){
            skatt=(lønn*25)/100;
        }
        else if(lønn>150000){
            skatt=(lønn*35)/100;
        }
    }

    public String toString(){
        String ut;
        ut=navn+" "+adresse+"\n"+
               "Lønn: "+lønn+" Skatt: "+skatt;
        return ut;
    }

    public Skatt(String navn, String adresse, double lønn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lønn = lønn;

    }
}
public class oppgave2 {

    public static void main(String[] args) {

        Skatt perHansen=new Skatt("Per Hansen","Oslo",400000);

        perHansen.beregn();

        System.out.println(perHansen);

    }


}
