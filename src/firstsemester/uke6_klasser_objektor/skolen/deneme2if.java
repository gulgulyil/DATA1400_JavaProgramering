package firstsemester.uke6_klasser_objektor.skolen;

public class deneme2if {

    public static void main(String[] args) {
        int alder= 15;

        if(alder>19){
            System.out.println("Du er over 19");
        }
        else if(alder>17){
            System.out.println("Du er over 17");
        }
        else if(alder>15){
            System.out.println("Du er over 15");
        }
        else{
            System.out.println("Du er mindre eller lik 15");
        }
    }
}
