package firstsemester.uke7.oppgaver;
/*
Lag en primtallssjekk. Et tall oppgis og det sjekkes om dette tallet er delelig med alle tall fra 1 og opp til det valgte tallet.
Dersom det er delelig bare med 1 og seg selv er det et primtall.
 */
import static javax.swing.JOptionPane.*;
public class oppgaveVans3 {
    public static void main(String[] args) {
        int rest;
        int teller=0;
        String ut;
        int tall=Integer.parseInt(showInputDialog("Skriv inn et heltall"));
        for(int i=1; i<=tall; i++){
            rest= tall%i;
            if (rest==0){
               teller++;
            }

        }
        /*
            if(c>2){
                    ut=" er ikke et primtall";
                    break;//gå ut av for-løkken det er ikke et primtall
                    */
        if(teller==2){
            ut=tall+" er primtall";
        }else{
            ut=tall+" er ikke primtall";
        }

        showMessageDialog(null,ut);


    }
}
