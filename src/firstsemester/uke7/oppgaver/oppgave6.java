package firstsemester.uke7.oppgaver;

//Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)

public class oppgave6 {
    public static void main(String[] args) {
        int tall=0;
        int sum=0;
        while(tall<10){
          sum=sum+tall;
          tall+=1;
        }
        System.out.println(sum);
    }
}
