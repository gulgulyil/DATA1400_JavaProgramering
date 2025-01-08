package firstsemester.uke13_Arv.forelesing;

class Ansatt{
    private  String navn;
    protected double lønn;// Se kommenter i Selger sin getlønn

    public Ansatt(String navn, double lønn) {
        this.navn=navn;
        this.lønn=lønn;
    }

    public String getNavn(){
        return this.navn;
    }

    public Double getLønn(){
        return this.lønn;
    }
}

class Selger extends Ansatt{
    private double bonus;

    public Selger(double bonus,String navn, double lønn){
        super(navn,lønn);
        this.bonus=bonus;
    }

    public double getlønn(){
        return this.lønn+this.bonus; //super.getlønn()+this.bonus ved private lønnsattributt
    }
}

class Montør extends Ansatt{
    private String bil;

    public Montør(String bil, String navn,double lønn){
        super(navn,lønn);
        this.bil=bil;
    }
}
public class Arv2 {
    public static void main(String[] args){
        Selger Per=new Selger(10_000,"Per Hansen",650_000);
        Montør Ole=new Montør("Volvo", "Ole Hansen",450_000);
        System.out.println(Per.getNavn()+" har i lønn "+Per.getLønn());
        System.out.println(Ole.getNavn()+" har i lønn "+Ole.getLønn());
    }
}
