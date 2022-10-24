package firstsemester.uke4_Aritmetikk.oppgave;

public class oppgave2 {
    /*
    Lag et program som definerer en variabel int antall=0. Skriv så ut partallene mellom 0 og 10 (2,4,6,8)
     ved å øke variabelen med 2 mellom hver gang.
     */

    public static void main(String[] args) {
        Integer antall= 0;

        for (int i=0; i<8; i+=2){
            antall+=2;
            System.out.print(antall+",");
        }
    }
}
