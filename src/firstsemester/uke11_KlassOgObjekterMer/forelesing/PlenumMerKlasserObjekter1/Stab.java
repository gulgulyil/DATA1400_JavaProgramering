package firstsemester.uke11_KlassOgObjekterMer.forelesing.PlenumMerKlasserObjekter1;

public class Stab {

    private Ansatt[] staben = new Ansatt[2];

    public Stab(){
        String ansatt1="Synnøve Solbakken";
        Dato født1=new Dato(1,1,1990);
        Dato tiltrått1=new Dato(20,8,2010);
        staben[0]=new Ansatt(ansatt1,født1, tiltrått1);

        String ansatt2="Sidsel Sidserk";
        Dato født2= new Dato(17,5,1986);
        Dato tiltrått2= new Dato (1,3,2008);
        staben[1]=new Ansatt(ansatt2, født2, tiltrått2);
    }
    @Override
    public String toString()
    {
        String output= "";
        for(Ansatt enAnsatt:staben){
            if(enAnsatt!=null){
                output+= enAnsatt+"\n";
            }
        }
        return output;
    }

}
