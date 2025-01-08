package firstsemester.uke8_Array.oppgaver;
/*
Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
 Tips: Sett største og minste tallet til første elementet i arrayet før løkken.
 */

public class oppgave5 {
    public static void main(String[] args) {
        int[] listtall = {45, 34, 5, 8, 10, 2, 13, 25};
        int minst = listtall[0];
        int størst = listtall[0];

        for (int i=0; i<listtall.length;i++) {
            if (listtall[i] < minst) {
                minst = listtall[i];
            }

            if (listtall[i]>størst) {
                størst = listtall[i];
            }
        }
        System.out.println("Arrays største tall er: "+størst);
        System.out.println("Array minste tall er: "+minst);
    }
}
