package firstsemester.uke7.oppgaver;

//Lag en forløkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
public class oppgave2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
