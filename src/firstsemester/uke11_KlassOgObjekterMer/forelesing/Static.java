package firstsemester.uke11_KlassOgObjekterMer.forelesing;

class Bil{
    public String type;
    public static final int ANTALL_HJUL=4;
}

public class Static {
    public static void main(String[] args) {
        Bil enBil=new Bil();
        enBil.type="Volvo";
        //Bil.antallHjul=4;

        System.out.println(enBil.type+" har antall hjul: "+Bil.ANTALL_HJUL);

        Bil enAnnenBil = new Bil();
        enAnnenBil.type="Audi";

        //Bil.ANTALL_HJUL=3;

        System.out.println(enAnnenBil.type+" har antall hjul:"+Bil.ANTALL_HJUL);
    }
}
