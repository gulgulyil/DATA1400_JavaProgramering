package firstsemester.uke5_klasser_objekter1.skolen.objekter1;

class Bill{
    public int tank;
    public double rekkeviide(double forbruk){
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}
public class Bil {

    public static void main(String[] args) {
        Bill volvo= new Bill();
        volvo.tank=80;
        double literPerMil= 0.8;
        double rekkevidde = volvo.rekkeviide(literPerMil);
        System.out.println("Rekkevidden til bilen er ");
        System.out.println(rekkevidde+" mil");

    }

}

