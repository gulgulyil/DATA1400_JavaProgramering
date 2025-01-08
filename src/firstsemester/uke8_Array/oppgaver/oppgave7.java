package firstsemester.uke8_Array.oppgaver;
/*
Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.
 */
public class oppgave7 {
    public static void main(String[] args) {
        int[] listTall={0,1,2,3,4,5,6,7,8,9,10};
        int parteller=0;
        int oddTeller=0;
        for(int i=0;i<listTall.length;i++){
            if(listTall[i]%2==0){
                parteller++;
            }else{
                oddTeller++;
            }
        }

        System.out.println("Array har "+parteller+" partaller");
        System.out.println("Array har "+oddTeller+" oddtaller");
    }

}
