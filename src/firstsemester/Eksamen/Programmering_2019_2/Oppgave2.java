package firstsemester.Eksamen.Programmering_2019_2;

import java.util.Arrays;
import java.util.Random;
class Trekning{
    public int[] vinnere(){
        int[]vinnere=new int[7];
        int i=0;
        while(i<7){
            int random=(int)(Math.random()*34+1);
            boolean funnet=false;
            for(int j=0; j<7; j++){
                if(vinnere[j]==random){
                    funnet=true;
                }
            }
            if(!funnet){
                vinnere[i]=random;
                i++;
            }
        }
        Arrays.sort(vinnere);
        return vinnere;
    }

}

public class Oppgave2 {
    public static void main(String[] args) {
        Trekning enTrekning=new Trekning();
        int[] vinnere=enTrekning.vinnere();
        System.out.println("Vinnere er ");
        for(int v:vinnere){
            System.out.print(v+" ");
        }
    }
}
