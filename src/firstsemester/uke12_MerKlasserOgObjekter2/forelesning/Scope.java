package firstsemester.uke12_MerKlasserOgObjekter2.forelesning;

public class Scope {

    private static int x=1;

    public static void main(String[] args) {
        int x=5;
        System.out.println("x verdien inne i main er "+x);
        brukLokalVariabel();
        brukGlobalVariabel();
        brukLokalVariabel();
        brukGlobalVariabel();
    }

    public static void brukLokalVariabel(){
        int x=25;
        System.out.println("x verdien inne i brukLokalVariabel er "+x);
        x++;
        System.out.println("x verdien inne i brukLokalVariabel er til slutt "+x);
    }

    public static void brukGlobalVariabel(){
        System.out.println("x verdien inne i brukGlobalVariabel er "+x);
        x*=10;
        System.out.println("x verdien inne i brukGlobalVariabel er til slutt "+x);
    }
}
