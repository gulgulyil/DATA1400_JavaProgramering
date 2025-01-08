package firstsemester.Eksamen.Programmering_2021_2;

/*
Definer følgende heltalls-array : 20, 34,-4,4,5,11,-23. Lag et Java-program som ved hjelp av en
løkke for hver av deloppgavene:
1. Skriver ut tabellen med mellomrom mellom tallene
2. Skriver ut tabellen baklengs med mellomrom mellom tallene
3. Summerer tabellen
4. Finner gjennomsnittet av tallene i tabellen
5. Skriver ut tallene som er mellom 0 og 20 (ikke inkludert tallene)
 */

public class Oppgave1 {
    public static void main(String[] args) {
        int[] heltallArray=new int[]{20, 34, -4, 4, 5, 11, -23};
        int sum=0;
        double snitt=0;
        int teller=0;
        for(int i=0; i<heltallArray.length;i++){
            System.out.print(heltallArray[i]+" ");
        }
        System.out.println();

        for(int i=heltallArray.length-1;i>=0;i--){
            System.out.print(heltallArray[i]+" ");
        }

        System.out.println();

        for(int i:heltallArray){
            sum+=i;
        }
        System.out.println("Summeren tabellen : "+sum);

        for(int i:heltallArray){
            teller++;
        }
        snitt=(double) sum/teller;
        System.out.println("Gjennomsnit av tabellen : "+String.format("%.2f",snitt));

        for(int i:heltallArray) {
            if (i > 0 && i < 20) {
                System.out.print(i + " ");
            }
        }

    }
}
