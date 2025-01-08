package firstsemester.uke8_Array.oppgaver;
import java.util.Arrays;
/*
Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke. Finn så gjennomsnittet av alle tallene.
Summer så alle tallene som er større enn 5. Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.
 */
public class oppgave2 {
    public static void main(String[] args) {


        int[] listeHeltall = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        double gjennomsnitt;

        for (int i = 0; i < listeHeltall.length; i++) {
            sum += listeHeltall[i];
        }

        System.out.println("Summen av listen: " + sum);

        gjennomsnitt = (double) sum / listeHeltall.length;

        System.out.println("Gjennomsnitt er av tallene: " + gjennomsnitt);

        int sum5 = 0;
        int teller = 0;
        double gjennomsnitt5 = 0;
        for (int tall : listeHeltall) {
            if (listeHeltall[tall-1] > 5) {
                sum5 += listeHeltall[tall-1];
                teller++;
            }

        }
        System.out.println("Summen av tallene som er storre enn 5: " + sum5);
        gjennomsnitt5 = (double) sum5 / teller;
        System.out.println("Gjennomsnitt av tallene som er større enn 5: " + gjennomsnitt5);

    }
}

