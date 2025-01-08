package firstsemester.uke4_Aritmetikk.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave5 {
    /*
    Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit og regn ut tilsvarende
    celsius med følgende formel: C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
     */

    public static void main(String[] args) {

        String fahrenheit=showInputDialog("Skriv inn verdien for fahrenheit");
        Double fahrenheitD=Double.parseDouble(fahrenheit);
        Double celsius= (fahrenheitD-32)/1.8;
        String celsiusS = String.format("%.2f",celsius);

        showMessageDialog(null,celsiusS);

    }
}
