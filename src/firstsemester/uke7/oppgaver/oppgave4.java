package firstsemester.uke7.oppgaver;

//Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)
public class oppgave4 {
    public static void main(String[] args) {
        int sum=0;
        int antall=0;
        for(int i=0; i<100;i++){
            if(i%2==0){
                antall+=1;
                sum+=i;
            }
        }
        double gjennomsnitt=(double)sum/antall;
        System.out.println(sum);
        System.out.println(antall);
        System.out.println(gjennomsnitt);
    }
}
