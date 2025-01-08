package firstsemester.uke9_Array2.skolen;

import java.sql.SQLOutput;
import java.util.ArrayList;
class Bil{
    public String farge;
    public int[] verdier=new int[5];
}
public class Array5 {
    public static void main(String[] args) {
        ArrayList<Bil> biler = new ArrayList<Bil>();

        Bil enVolvo = new Bil();
        enVolvo.farge = "Rød";
        enVolvo.verdier[0] = 4; //antall dører f. eks
        enVolvo.verdier[1] = 250; // antall hk f.eks

        Bil enAudi = new Bil();
        enAudi.farge = "Blå";
        enAudi.verdier[0] = 5;
        enAudi.verdier[1] = 345;

        biler.add(enAudi);
        biler.add(enVolvo);

        for (Bil enBil : biler) {
            System.out.println("fargen: " + enBil.farge);
            System.out.println("Antall dører: " + enBil.verdier[0]);
            System.out.println("Antall HK: " + enBil.verdier[1]);
            System.out.println("----------");
        }

        biler.remove(enAudi);
        biler.add(enVolvo);

        for (Bil enBil : biler){
            System.out.println("Fargen: "+enBil.farge);
            System.out.println("Antall derer: "+enBil.verdier[0]);
            System.out.println("Antall HK: "+enBil.verdier[1]);
            System.out.println("------------");
        }

        System.out.println("Lengden på arrayet er nå:"+biler.size());
        biler.clear();
        System.out.println("Lengden på arrayet er nå:"+biler.size());
    }
}
