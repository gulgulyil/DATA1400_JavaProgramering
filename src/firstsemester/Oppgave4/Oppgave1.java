package firstsemester.Oppgave4;
/*
Oppgave 1
Array og løkker.

Gitt følgende int [] liste =  {2,4,6,12,78,45,3,42,5,-7};

Skriv kode for å summere tallene med en for-løkke. Gjør det samme med en for each -løkke (utvidet for-løkke).
Summene skal skrives ut i System.out på to forskjellige linjer.
 */

public class Oppgave1 {

    public static int sumListe(int[] listeTall){
        int sum=0;
        for(int i=0;i<listeTall.length;i++){
            sum+=listeTall[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]listeTall={2,4,6,12,78,45,3,42,5,-7};
        System.out.println("Summen av liste er "+sumListe(listeTall));
    }
}
