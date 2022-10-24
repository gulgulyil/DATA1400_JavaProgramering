
package firstsemester.uke5_klasser_objekter1.skolen;

class Bil {
    public String farge;
    //kan ha attributer, men ikke som blir brukt i metoden!

}


public class BilKlass {
    public static void main(String[] args) {
        Bil bil1= new Bil();
        Bil bil2= new Bil();
        bil1.farge="rød";
        bil2.farge="grønn";
        Bil bil3 =new Bil();
        bil3.farge="blå";

        System.out.println("Fargen til bil 3 er "+bil3.farge);
        }


    }
