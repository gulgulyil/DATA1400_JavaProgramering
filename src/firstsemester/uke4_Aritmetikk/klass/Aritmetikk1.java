package firstsemester.uke4_Aritmetikk.klass;

public class Aritmetikk1 {

    public static void main(String[] args) {

        int tall1 =2 ;
        int tall2 =4 ;
        int sum =tall1+tall2 ;
        int subtraksjon= tall1-tall2;
        int multiplikasjon = tall1*tall2;
        int divisjon= tall1/tall2;

        double tall4=3;
        double divisjon1= tall1/tall2;

        int tall5=23;
        int tall6=3;

        double tall7 = (double) tall5/(double)tall6;

        double tall8= (double) tall5/tall6;

        double tall9= tall5/(double)tall6;

        if(tall5== tall6) {
            System.out.println("Tallene er like");
            System.out.println(tall5);
        }

        if(tall5 != tall6){
            System.out.println("Tallene er ikke like!");
        }

        if(tall1> tall2){
            System.out.println("Tall1 er større enn tall2");
        }

        if(tall1<tall2){
            System.out.println("Tall1 er mindre enn tall2");
        }

        if(tall1 >= tall2){
            System.out.println("Tall1 er større eller lik tall2 ");
        }

        if(tall1<=tall2){
            System.out.println("Tall1 er mindre lik tall2");
        }
        /*

         */
        //
    }
}
