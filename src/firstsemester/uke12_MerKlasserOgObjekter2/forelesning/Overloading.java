package firstsemester.uke12_MerKlasserOgObjekter2.forelesning;

public class Overloading {

    public static void main(String[] args){
        System.out.println("Summen blir : "+summer(3.3,3.3));
        System.out.println("Summen blir : "+summer(3,3,3));
    }

    private static double summer(double tall1,double tall2){
        double sum=tall1+tall2;
        return sum;
    }

    private static double summer(double tall1,double tall2, double tall3){
        double sum= tall1+tall2+tall3;
        return sum;
    }
}
