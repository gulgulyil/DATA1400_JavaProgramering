package firstsemester.uke7.klasse;

public class whileLøker {

    public static void main(String[] args) {
        int teller= 0;

        while (teller<100){
            System.out.println(teller+" ");
            teller= teller+1;
            System.out.println(teller);
            teller+=1;
            System.out.println(teller);
            teller=teller*2;
            System.out.println(teller);
            teller*=2;
            System.out.println(teller);
            teller++;
            System.out.println(teller);
        }
    }
}
