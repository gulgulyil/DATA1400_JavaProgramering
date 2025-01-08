package firstsemester.uke9_Array2.oppgaver;
/*
Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9. Skriv kode for å konvertere dette til et vanlig heltalls-array.
Skriv så kode for å skrive ut det nye heltalls-arrayet
 */
import java.util.ArrayList;
public class oppgave4 {
    public static void main(String[] args) {
      ArrayList<Integer> liste1=new ArrayList<>();

      for(int i=1;i<10;i++){
          liste1.add(i);
      }

      int[] liste2=new int[liste1.size()];
      for (int i=0;i<liste1.size();i++){
          liste2[i]=liste1.get(i);
          System.out.print(liste2[i]+" ");
      }

      for(int i:liste2){
          System.out.print(i+" ");
      }
    }
}
