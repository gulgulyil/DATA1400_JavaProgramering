package firstsemester.Eksamen.Programmering_2019_1;

/*
a) Skriv kode som summerer alle heltallene mellom 100 og 200 (inklusive tallene) og skriver ut
summen på System.out. Bruk en for-løkke.
b) Skriv kode som skriver ut hvert tredje tall fra 100 (inklusive tallet) og opp tll 200 på System.out. Bruk
en while-løkke.
 */

public class Oppgave1 {

    public static void main(String[] args) {
        int sum=0;
        for(int i=100;i<=200;i++){

            sum+=i;

        }
        System.out.println(sum);

        int tall=100;

        while(tall<=200){
            System.out.print(tall+" ");
            tall+=3;
        }
    }
}
