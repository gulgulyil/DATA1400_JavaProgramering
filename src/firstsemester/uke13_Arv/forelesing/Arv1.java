package firstsemester.uke13_Arv.forelesing;

class Ansatt1{
    private String navn;
    private double lønn;

    public Ansatt1(String navn,double lønn){
        this.navn=navn;
        this.lønn=lønn;
    }

    public String getNavn(){
        return this.navn;
    }

    public double getLønn(){
        return this.lønn;
    }

}

class Selger1 extends Ansatt1{

    private static final double bonus= 30_000;
    public Selger1(String navn,double lønn){
        super(navn,lønn);
    }

    public double getlønn(){
        return super.getLønn()+bonus;
    }
}

class Montør1 extends Ansatt1{
    public Montør1(String navn,double lønn){
        super(navn,lønn);
    }
}


public class Arv1 {
    public static void main(String[] args) {

        Ansatt1 SelgerA=new Selger1("Per Hansen",400_000);
        Ansatt1 MontørA=new Montør1("Ole Olsen",300_000);

        Ansatt1[] liste=new Ansatt1[10];
        liste[0]=SelgerA;
        liste[1]=MontørA;

        for(int i=0; i<liste.length&& liste[i]!=null;i++){
            System.out.println(liste[i].getNavn()+" tjener "+liste[i].getLønn());
        }


    }
}
