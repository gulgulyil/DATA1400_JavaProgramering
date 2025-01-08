package firstsemester.uke14_Interface.oving;

interface Kjøretøy {
    public String toString();
}
class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "semtember", "oktober", "november", "desember"};

        if (mnd > 0 && mnd < 13)
            return navn[mnd - 1];
        else
            return "ukjent måned";
    }

    public String toString() {
        return dag + " " + månedsnavn(måned) + " " + år;
    }
}


class Motorsykkel implements Kjøretøy{
    public String typeBetegnelse;
    public Dato førstegangRegistert;
    public String kjennetegn;

    public Motorsykkel(String typeBetegnelse, Dato førstegangRegistert,String kjennetegn){
       this.typeBetegnelse=typeBetegnelse;
       this.førstegangRegistert=førstegangRegistert;
       this.kjennetegn=kjennetegn;
    }

    public String toString(){
    String ut="Typebetegnelse : "+typeBetegnelse+"\n"+
            "Første gangs registreringsdato : "+førstegangRegistert+"\n"+
            "Kjennetegn : "+kjennetegn;
        return ut;
    }
}

class Bil implements Kjøretøy{
    public String typeBetegnelse;
    public Dato førstegangsRegistert;
    public String kjennetegn;
    public int lastekapasitet;

    public Bil(String typeBetegnelse,Dato førstegangsRegistert, String kjennetegn, int lastekapasitet){
        this.typeBetegnelse=typeBetegnelse;
        this.førstegangsRegistert=førstegangsRegistert;
        this.kjennetegn=kjennetegn;
        this.lastekapasitet=lastekapasitet;
    }

    public String toString(){
        String ut="Typebetegnelse : "+typeBetegnelse+"\n"+
                "Første gangs registreringsdato : "+førstegangsRegistert+"\n"+
                "Kjennetegn : "+kjennetegn+"\n"+
                "Lastekapasitet : "+lastekapasitet+" kg";
        return ut;
    }

}

public class Motorvogn1 {

    public static void main(String[] args){
        Kjøretøy[] register=new Kjøretøy[100];
        Dato dato1=new Dato(1,3,2015);
        Bil volvo=new Bil("Volvo T5",dato1,"DP23456",450);
        Dato dato2=new Dato(4,10,2016);
        Motorsykkel ducati=new Motorsykkel("Ducati",dato2,"DR2456");

        register[0]=volvo;
        register[1]=ducati;

        for(Kjøretøy etKjøretøy : register){
            if(etKjøretøy!=null){
                System.out.println(etKjøretøy);
                System.out.println("--------");
            }
        }
    }
}
