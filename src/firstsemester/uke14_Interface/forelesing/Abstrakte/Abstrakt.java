package firstsemester.uke14_Interface.forelesing.Abstrakte;

abstract class Kjøretøy{
    protected int tankVolum;
    protected int antallHjul;
    protected String farge;

    public Kjøretøy(int tankVolum,int antallHjul, String farge){
        this.tankVolum=tankVolum;
        this.antallHjul=antallHjul;
        this.farge=farge;
    }

    abstract public int getAntallDører();

}

class Bil extends Kjøretøy{
    protected int antallDører;

    public Bil(int antallDører,int tankVolum, int antallHjul,String farge){
        super(tankVolum, antallHjul, farge);
        this.antallDører=antallDører;
    }

    @Override
    public int getAntallDører(){
        return this.antallDører;
    }

}

class Motorsykkel extends Kjøretøy{

    public Motorsykkel(int tankVolum,int antallHjul,String farge){
        super(tankVolum,antallHjul,farge);
    }

    @Override
    public int getAntallDører(){
        return 0;
    }

}
public class Abstrakt {

    public static void main(String[] args) {
        Kjøretøy[] liste= new Kjøretøy[5];
        Kjøretøy enBil=new Bil(5,50,4,"Rød");
        liste[0]=enBil;
        System.out.println("Antall dører til bilen: "+liste[0].getAntallDører());
        Kjøretøy enMotorsykkel=new  Motorsykkel(10,2,"Sort");
        liste[1]=enMotorsykkel;
        System.out.println("Antall dører på motorsykkelen "+liste[1].getAntallDører());
    }
}
