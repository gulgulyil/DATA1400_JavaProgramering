package firstsemester.uke11_KlassOgObjekterMer.oppgaver;

import java.sql.SQLOutput;

/*
Det skal lages et motorvognregister.
Skallkoden for dette følger under. Ta utgangspunkt i koden og fullfør den der det står kommentarer.

 */
class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        // lag denne
        String a="";

        return a;
    }
}

class Bil{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;

    public Bil(String typeBetegnelse,Dato førstegangsRegistrert, String kjennetegn) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString() {
        String ut = "Typebetegnelse :" + typeBetegnelse + "\n" +
                "Første gangs registreringsdato : " + førstegangsRegistert + "+n" +
                "Kjennetegn : " + kjennetegn;
        return ut;
      }
    }
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    // lag også konstruktør for alle attributtene

    // lag så en toString metode for å vise alle attributtene





public class oppgave {

    public static void main(String[] args) {
        // opprett et array av Biler

        // Sett inn noen biler i arrayet

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        Bil[] register=new Bil[100];
        Dato dato1 = new Dato(1,3,2015);

        Bil volvo=new Bil("Vovlo T5",dato1,"DP23456");

        Dato dato2=new Dato(4,10,2016);

        Bil audi=new Bil("Audi R8",dato2,"DR45678");

        register[0]=volvo;
        register[1]=audi;

        for(Bil enBil : register){
            if(enBil!=null){
                System.out.println(enBil);
                System.out.println("-----");
            }
        }


    }
}
