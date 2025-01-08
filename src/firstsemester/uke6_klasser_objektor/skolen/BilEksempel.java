package firstsemester.uke6_klasser_objektor.skolen;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

class Bil {

    public int tank;
    public double rekkevidde(double forbruk){
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}
 public class BilEksempel {
    public static void main(String[] args){
        Bil volvo= new Bil();
        volvo.tank =80;
        double literPerMil = 0.8;
        double rekkevidde = volvo.rekkevidde(literPerMil);
        System.out.println("Rekkevidden til bilen er ");
        System.out.println(rekkevidde+" mil");
    }
 }