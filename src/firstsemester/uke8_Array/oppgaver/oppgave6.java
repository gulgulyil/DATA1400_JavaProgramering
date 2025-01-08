package firstsemester.uke8_Array.oppgaver;
/*
Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.
 */

public class oppgave6 {
    public static void main(String[] args) {
        int [] list1={1,2,3,4,5,6,7,8};
        int [] list2={1,2,3,4,5,6,7,8,9};
        boolean b=false;

        if(list2.equals(list1)){
            b=true;
        }
        System.out.println("List1 er like list2 "+b);

    }
}
