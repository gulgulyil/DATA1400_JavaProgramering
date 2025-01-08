package firstsemester.uke11_KlassOgObjekterMer.forelesing.PlenumMerKlasserObjekter1;

public class Dato {

    private int dag,måned, år;

    public Dato(int dag, int måned, int år){
        this.dag=dag;
        this.måned=måned;
        this.år=år;
    }

    public String toString(){
        return dag+". "+månedsnavn(måned)+" "+år;
    }

    private static String månedsnavn(int mnd){
        String[] navn={"januar","februar","mars","april","mai",
        "juni","juli","august","september","oktober","november",
        "desember"};
        if(mnd>0 && mnd<13)
            return navn[mnd-1];
        else return "ukjent måned";
    }
}
