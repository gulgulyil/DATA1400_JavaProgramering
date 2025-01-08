package firstsemester.Eksamen.Programmering_2021_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Det skal lages en klasse med to metoder kalt "storst" og "minst". Disse metodene skal ta inn en
ArrayListe av heltall og returnere henholdsvis det største og minste tallet.
Lag så en "main" metode som gjør følgende:
Instansierer den nevnte klassen over
Oppretter en liste av heltall
Legger inn noen heltall i listen
Skriver ut på System.out det største og minste tallet i listen ved hjelp av kallet til de to
metodene.

 */

class finStorstOgMinst{
    public int storst1(ArrayList<Integer>list){
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public int minst1(ArrayList<Integer>list){
        Collections.sort(list);
        return list.get(0);
    }
        }

public class Oppgave3 {


    public static Integer storst(ArrayList<Integer>list){
       int storst= list.get(0);
        for(int i=0; i< list.size();i++){
            if(list.get(i)>(storst)){
                storst=list.get(i);
            }
        }
        return storst;
    }

    public static Integer minst(ArrayList<Integer>list) {
        int minst = list.get(0);
        for (int i : list) {
            if (i < minst) {
                minst = i;
            }
        }
        return minst;
    }

    public static void main(String[] args) {
        finStorstOgMinst finn=new finStorstOgMinst();
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(24);

        for(int i:list){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Minste er "+minst(list));
        System.out.println("Største er "+storst(list));
        System.out.println("Største: "+finn.storst1(list));
        System.out.println("Minste: "+finn.minst1(list));

    }

}
