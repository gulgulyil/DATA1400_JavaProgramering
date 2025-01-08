package firstsemester.Eksamen.Programmering_2021_1;
/*
Det skal opprettes en statisk metode kalt funnetTall. Denne metoden skal ta inn et heltallsarray
og et heltall. Metoden skal så sjekke om tallet som kommer inn i metoden ligger i arrayet og
dersom det gjør det skal det returneres en boolean lik true. Dersom tallet ikke finnes i arrayet skal
det returneres false.
Opprett så i main metoden (se under) et heltallsarray og legg inn noen heltall i dette arrayet. Kall
så metoden med et heltall. Skriv så ut på System.out om tallet ligger i arrayet eller ikke.
 */
public class Oppgave2 {
    public static boolean funneTall(int[] heltallsarray,int heltall){
        boolean funnet=false;
        for(int i=0; i<heltallsarray.length;i++){
            if(heltallsarray[i]==heltall){
                funnet=true;
                break;
            }
        }
        return funnet;
    }
    public static void main(String[] args) {

        int[] heltallsarray={1,2,3,4,5,6,7,8,};
        int heltall=5;
        int heltall2=10;

        System.out.println(funneTall(heltallsarray,heltall));
        System.out.println(funneTall(heltallsarray,heltall2));

    }
}
