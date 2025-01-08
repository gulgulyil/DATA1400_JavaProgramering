package firstsemester.Eksamen.Programmering_2020_1;

import javax.swing.*;
import javax.swing.JOptionPane.*;

/*
Det skal lages en enkel løsning med inputbokser og meldingboks for å konvertere fra celcius grader (C)
til fahrenheit (F) og motsatt.
Løsningen skal gjøre følgende :
Lese inn en streng fra en inputdialogboks hvor det skal oppgis hva det skal konverteres FRA (C eller F
skal skrives inn)
Lese så inn gradene fra en ny inputdialogboks
Konvertere gradene til en double
Avhengig av hva som er skrevet inn i den første inputboksen regne ut resultatet via følgende formler:
Fra Celcius til Fahrenheit: F = C * 1.8 + 32
fra Fahrenheit til Celcius: C = (F - 32) / 1.8
Skriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldingsboks.
Dersom det ikke er skrevet inn hverken C eller F i den første inputboksen skal det ikke regnes ut noe, men
skrives ut i meldingsboksen at det må skrives inn enten C eller F.
 */

public class Oppgave3 {

    public static void main(String[] args) {
        String graderNavn=JOptionPane.showInputDialog("Oppgi hva det skal konverteres fra (C eller F skriv inn)");
        String inngrade;
        double fahrenheit;
        double celcius;
        String ut;


            if(graderNavn.equals("C")) {
                inngrade=JOptionPane.showInputDialog("Skriv inn Celcius grade");
                try {
                    celcius = Double.parseDouble(inngrade);
                    fahrenheit = (celcius * 1.8) + 32;
                    ut = String.format("%.2f", celcius) + "celcius blir " + String.format("%.2f", fahrenheit) + " fahrenheit.";
                    JOptionPane.showMessageDialog(null, ut);
                }
                  catch (Exception e){
                        ut="Skriv inn kun tall";
                        JOptionPane.showMessageDialog(null,ut);
                    }
            }
            else if(graderNavn.equals("F")){
                inngrade=JOptionPane.showInputDialog("Skriv inn Fahranheit grade");
                fahrenheit=Double.parseDouble(inngrade);
                celcius=(fahrenheit-32)/1.8;
                ut = String.format("%.2f", fahrenheit) + "fahrenheit blir " + String.format("%.2f", celcius) + " celcius.";
                JOptionPane.showMessageDialog(null, ut);

            }
            else{
                JOptionPane.showMessageDialog(null,"Det må skrives inn enten C eller F");
            }
        }


    }

