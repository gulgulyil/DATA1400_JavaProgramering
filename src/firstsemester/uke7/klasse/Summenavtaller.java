package firstsemester.uke7.klasse;

public class Summenavtaller {

    public static void main(String[] args) {
        int sum=0;
        int fratall=100;
        int tilTall=1000;

        for(int i=fratall;i<tilTall;i++){
            sum=sum+i;
        }

        System.out.println("Summen av alle tall mellom "+fratall+ " og "+tilTall+" er "+sum);
    }
}
