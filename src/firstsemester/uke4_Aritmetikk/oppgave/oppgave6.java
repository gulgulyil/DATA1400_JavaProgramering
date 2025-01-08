package firstsemester.uke4_Aritmetikk.oppgave;

import static javax.swing.JOptionPane.*;


public class oppgave6 {
    /*Lag et program som leser inn et beløp i amerikanske dollar (USD) og regner om og skriver ut tilsvarende beløp i norske kroner.
     Benytt dagens valutakurs fra nettet.
     */

    public static void main(String[] args) {

        String dolar= showInputDialog("Skriv inn et belop i amerikanske dolar");
        Double dolarD = Double.parseDouble(dolar);
        Double kron= dolarD*10.34;
        String kronS= String.format("%.2f",kron);
        String ut= (dolarD + "USD er " + kronS+ " kron.");

        showMessageDialog(null,ut);

    }
}
