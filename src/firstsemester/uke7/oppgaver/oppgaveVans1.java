package firstsemester.uke7.oppgaver;

import static javax.swing.JOptionPane.*;
/*
Beregn Pi med 10 desimalers nøyaktighet. Pi med 12 desimaler er 3.14159265358. Bruk en løkke til å beregne pi ved hjelp av denne rekken:

Pi=4-4/3+4/5-4/7+4/9-4/11+....

Lag en innlesning av antall ledd i rekken (omganger i løkken) slik at det er mulig å variere hvor mange som trengs for å
oppnå en presisjon på 10 siffer.

Tips: Bruk long isteden for int for å ha mulighet for stort nok tall i løkken.
 */
public class oppgaveVans1 {

    public static void main(String[] args) {
        int nummer=Integer.parseInt(showInputDialog("Skriv inn et heltall for antall :"));
        double pi=4;
        int fortegn=-1;
        for (long i=3;i<nummer;i+=2){
            pi+=fortegn*(4/(double)i);
            fortegn=-fortegn;
        }
        showMessageDialog(null,"PI skal være 3.14159265358.\n Blir: "+pi);
    }
}
