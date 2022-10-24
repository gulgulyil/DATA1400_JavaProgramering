package firstsemester.uke6_klasser_objektor.skolen;


class Bill{
    //ingen attributter
    public double rekkevidde(double tank, double forbruk){
        double rekkevidde= tank/forbruk;
        return rekkevidde;
    }
}
public class EksempelBil {
    public static void main(String[]args){
        Bill volvo = new Bill();
        double rekkevidde = volvo.rekkevidde(80,0.8);

    }
}
