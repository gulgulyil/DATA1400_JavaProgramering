package firstsemester.uke6_klasser_objektor.oppgaver_switch;

import static javax.swing.JOptionPane.*;

/*
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch.
 */
public class oppgave5 {

    public static void main(String[] args) {
        String månedsnavn= showInputDialog("Skriv inn en måne");
        String ut="";

        if(månedsnavn.equals("Sommer")){
            ut="Sommer : juni, juli, august";
        }
        else if(månedsnavn.equals("Høst")){
            ut="Høst : september, oktober, november";
        }
        else if(månedsnavn.equals("Vinter")){
            ut="Vinter : desember, januar, februar";
        }
        else if(månedsnavn.equals("Vår")){
            ut="Vår : mars, april, mai";
        }

       System.out.println(ut);

        switch (månedsnavn){

            case"Sommer" :
                ut="Sommer : juni, juli,august";
                break;
            case "Høst" :
                ut="Høst : september, oktober, november";
                break;
            case "Vinter" :
                ut="Vinter : desember, januar, februar";
                break;
            case "Vår" :
                ut="Vår : mars, april, mai";
                break;
            default:
                ut="Skriv inn en måne engang til";
                break;
            }

            showMessageDialog(null,ut);

        }
    }

