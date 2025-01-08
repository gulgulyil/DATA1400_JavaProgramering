package firstsemester.uke9_Array2.oppgaver;
/*
Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9. Skriv kode for å konvertere dette til et ArrayList. Skriv så ut denne ArrayListen.
 */
import java.util.Arrays;
import java.util.ArrayList;
public class oppgave3 {

    public static void main(String[] args) {

    int[] liste1= {1,2,3,4,5,6,7,8,9};

    ArrayList<Integer> liste2 = new ArrayList<>();

    for(int i : liste1){
        liste2.add(i);
        }
    for(int i=0; i<liste2.size();i++){
        System.out.print(liste2.get(i));
    }
    }
}

