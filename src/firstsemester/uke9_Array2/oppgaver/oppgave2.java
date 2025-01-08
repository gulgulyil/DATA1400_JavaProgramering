package firstsemester.uke9_Array2.oppgaver;

import java.util.ArrayList;

/*
Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet. Slett så elementene med tallene 2 og 3.
Skriv så ut hele arrayet med en for-løkke. Bruk size() for å finne lengden i arrayet.
 */
public class oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i=1; i<10; i++){
            liste.add(i);
        }
        liste.add(10);
        liste.add(11);
        liste.remove(1);
        liste.remove(1);

        for(int i=0; i<liste.size();i++){
            System.out.print(liste.get(i)+" ");
        }
    }
}

