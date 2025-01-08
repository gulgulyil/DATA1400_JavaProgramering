package firstsemester.Eksamen.Programmering_2021_2;

import javax.swing.*;
import javax.swing.JOptionPane.*;

/*
Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes inputdialogbokser og meldingsboks fra Swing-bibliotektet.
Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
Så skal BMI'en regnes ut med følgende formel:
( 1,3 * vekt) / ( høyde/100)^ 2,5 )
^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntalllet og b eksponenten.
Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
isteden for beregningen.
 */

public class Oppgave2 {
    public static void main(String[] args) {
        String innVekt= JOptionPane.showInputDialog("Skriv inn vekt i kg");
        String innHøyd=JOptionPane.showInputDialog("Skriv inn høyd i cm");
        double vekt;
        double høyd;
        double bmi;
        try{
            vekt=Double.parseDouble(innVekt);
            høyd=Double.parseDouble(innHøyd);
            bmi=(1.3*vekt)/(Math.pow(høyd/100,2.5));
            JOptionPane.showMessageDialog(null,"BMI: "+String.format("%.2f",bmi));
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Skriv inn kun desimaltall");
        }
    }
}
