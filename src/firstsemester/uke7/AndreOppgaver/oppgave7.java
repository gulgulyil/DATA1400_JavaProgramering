package firstsemester.uke7.AndreOppgaver;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
/*
Lag et program som skriver ut en rettvinklet trekant med *. Input hvor mange stjerner grunnflaten skal være. F.eks: 3 * gir
X
XX
XXX

 */
public class oppgave7 {
    public static void main(String[] args) {
        int tall=Integer.parseInt(showInputDialog("Skriv inn tall"));
        int j;

        for(int i=0; i<=tall; i++){
            for(j=i-1;j>=0;j--) {
                 System.out.print("*");
             }
            System.out.println("");

            }
        String ut="";
        for(int i=0;i<tall;i++){
            for(j=0;j<=i;j++){
                ut+="*";
            }
            ut+="\n";
        }
        showMessageDialog(null,ut);
        }
    }

