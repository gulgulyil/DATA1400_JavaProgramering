package firstsemester.uke3.oppgave;

import static javax.swing.JOptionPane.*;

public class oppgave3 {

    /*
    Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn. Vis så dette resultatet via
    1) Meldingsboks og 2) System.out.
     */

    public static void main (String [] args){
        double tall1, tall2, tall3, gjennomsnitt;
        tall1= 32.24;
        tall2= 54.23;
        tall3= 100.98;
        gjennomsnitt= (tall1+tall2+tall3)/3;

        System.out.println("gjennomsnitt er "+gjennomsnitt);
        showMessageDialog(null,"Gjennomsnitt er "+gjennomsnitt);

    }


}
