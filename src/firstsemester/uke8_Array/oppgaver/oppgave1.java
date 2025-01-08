package firstsemester.uke8_Array.oppgaver;

import java.util.Arrays;
/*
Definer følgende helttalls-array: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out

 */
public class oppgave1 {
    public static void main(String[] args) {
        int[] listeHeltall={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<listeHeltall.length;i++){
            System.out.print(listeHeltall[i]+" ");
        }
        System.out.println();
        System.out.println("Element nummer 3: "+listeHeltall[3]);
        System.out.println("Element nummer 6: "+listeHeltall[6]);

        int location3 = Arrays.binarySearch(listeHeltall, 3);
        int location6=Arrays.binarySearch(listeHeltall,6);

        System.out.println("\n Indeksen til tallet 3 er: "+location3);
        System.out.println("\n Indeksen til tallet 6 er: "+location6);

    }
}
