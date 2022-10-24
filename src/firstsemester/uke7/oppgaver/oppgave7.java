package firstsemester.uke7.oppgaver;

//Lag en while-løkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).

public class oppgave7 {
    public static void main(String[] args) {
        int tall=0;
        while(tall<20){
            System.out.print(tall+" ");
            tall+=2;
        }
    }
}
