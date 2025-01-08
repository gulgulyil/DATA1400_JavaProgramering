package firstsemester.uke11_KlassOgObjekterMer.forelesing.PlenumMerKlasserObjekter1;

public class Ansatt {
    private String navn;
    private Dato født,tiltrådt;
    private int lønnstrinn=0;
    private final int MIN=30, MAX=80;

    public Ansatt(String navn, Dato født, Dato tiltrått){
        this.navn=navn;
        this.født=født;
        this.tiltrådt= tiltrått;
        lønnstrinn=MIN;
    }

    public String getNavn(){ return navn; }

    public int getLønnstrinn() {return lønnstrinn; }

    public void setLønnstrin(int lønnstrinn){
        if(lønnstrinn>=MAX ){
            this.lønnstrinn= MAX;
        }
        else{
            this.lønnstrinn=lønnstrinn;
        }
    }

    public String toString()
    {
        return navn+",født:  "+
                født.toString()+", tiltrådt: "+
                tiltrådt.toString();
    }
}
