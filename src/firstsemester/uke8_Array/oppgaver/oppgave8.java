package firstsemester.uke8_Array.oppgaver;
import static javax.swing.JOptionPane.*;
/*
Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.
Lag et program som først leser inn hvor mange poengsummer som skal leses inn. Så skal det opprettes et heltalls-array
 med riktig lengde (fra input). Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles.
 Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen. (Det er mulig å
 */

public class oppgave8 {
    public static void main(String[] args) {
        int antall,poeng;
        String innAntall,innPoeng;
        innAntall=showInputDialog("Hvor mange poengsummer skal leses inn?");
        try{
            antall=Integer.parseInt(innAntall);
        }
        catch(Exception e){
            showMessageDialog(null,"Feil,det ble ikke satt noe antall, avslutter");
            antall=0;
        }
        int[]poengsum = new int[antall];
        while(antall>0){
            //les inn poengsummer inn i arrayet
            innPoeng=showInputDialog("Skriv inn en poengsum: ");
            try{
                poeng=Integer.parseInt(innPoeng);
                poengsum[antall-1]=poeng;// fyller arrayet baklengs,
                antall--;
            }
            catch(Exception e) {
                showMessageDialog(null, "Feil i input av poengsum, trykk Enter");
            }
            //gjennomsnittet
            int sum=0;
            for(int i: poengsum){
                sum+=i;
            }
            if(poengsum.length>0){
                double gjennomsnitt = (double)sum/poengsum.length;
                showMessageDialog(null,"Gjennomsnittet er "+String.format("%.2f",gjennomsnitt));
            }
        }
    }

}
