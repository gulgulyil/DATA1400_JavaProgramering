package firstsemester.Eksamen.Programmering_2021_1;

/*
a) Skriv kode for å summere hvert 5 tall fra og med 5 til og med 100. Det skal brukes en for-løkke.
Resultatet skal skrives ut på System.out. Skriv kode for å finne gjennomsnittet også.
b) Skriv tilsvarende kode som over med bruk av en while-løkke
 */

public class Oppgave1 {
    public static void main(String[] args) {
        int sum=0;
        int teller=0;
        double gjennomsnitt=0;
        for(int i=5;i<=100;i+=5){
            sum+=i;
            teller++;
        }
        gjennomsnitt=(double) sum/teller;
        System.out.println("Summen er "+sum);
        System.out.println("Gjennomsnitt er "+gjennomsnitt);

        int j=5;
        int sum2=0;
        double gjennomsnitt2=0;
        int teller2=0;

        while (j<=100){
            sum2+=j;
            j+=5;
            teller2++;
        }
        gjennomsnitt2=(double)sum2/teller2;
        System.out.println("Summen er "+sum2);
        System.out.println("Gjennomsnitt er "+gjennomsnitt2);
    }
}
