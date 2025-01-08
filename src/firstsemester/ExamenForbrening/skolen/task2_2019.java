package firstsemester.ExamenForbrening.skolen;


import java.util.Arrays;
import java.util.Random;

class Trekning{
    int vinnertall=0;
    int vinnertallene[]=new int[7];

    public void leggIntallenen(){
        Random r=new Random();
        for(int i=0; i<=vinnertallene.length; i++){
           vinnertall= r.nextInt(1,34);
           vinnertallene[i]=vinnertall;
        }
    }

    public void sorterPrint(){
        Arrays.sort(vinnertallene);
        for(int i:vinnertallene){
            System.out.println(i+" ");
        }
    }
}

public class task2_2019 {

    public static void main(String[] args) {

    }
}
