package firstsemester.uke7.oppgaver;

//Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
//
//Finn også gjennomsnittet.

public class oppgave8 {
    public static void main(String[] args) {
        int tall=0;
        int sum=0;
        int antall=0;
        double gjennomsnitt;

        while(tall<100){
            sum=sum+tall;
            tall+=2;
            antall+=1;
        }

        gjennomsnitt=(double) sum/antall;
        System.out.println(sum);
        System.out.println(antall);
        System.out.println(gjennomsnitt);
    }
}
