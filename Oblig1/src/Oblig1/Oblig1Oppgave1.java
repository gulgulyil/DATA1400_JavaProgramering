package Oblig1;

import static java.lang.Math.*;

class Sirkel{

    public static double diameter(double radius){
        double diameter = radius * 2;
        return diameter;
    }
    public static double omkrets(double radius){
        double omkrets = 2*PI*radius;
        return omkrets;
    }
    public static double areal(double radius){
        double areal = PI*Math.pow(radius,2);
        return areal;
    }
}
public class Oblig1Oppgave1 {
    public static void main(String[] args){
        double radius = 23.5;
        double areal = Sirkel.areal(radius);
        double omkrets = Sirkel.omkrets(radius);
        double diameter = Sirkel.diameter(radius);
        System.out.println("Arealet av sirkelen med radius "+radius+" er "+String.format("%.2f",areal));
        System.out.println("Omkretsen av sirkelen med radius "+radius+" er "+String.format("%.2f",omkrets));
        System.out.println("Diameteren til sirkelen med radius "+radius+" er "+String.format("%.2f",diameter));
    }
}
