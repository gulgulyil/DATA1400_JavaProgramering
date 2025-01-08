package firstsemester.uke3;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class variable2 {

    public static void main(String[] args) {
        int alderPer = 23;
        int alderLine,sumAlder;
        alderLine= 22;
        sumAlder = alderPer + alderLine;
        System.out.println("Summen av alderene er " + sumAlder );

        String innNavn = JOptionPane.showInputDialog (" Skriv inn navnet");
        String innAlder= JOptionPane.showInputDialog(" Skriv inn alderen");

        int alder= Integer.parseInt(innAlder);
        int fødselår= 2022- alder;
        showMessageDialog(null,innNavn+" er født "+ fødselår);

        String innStreng1= showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = showInputDialog(" Skriv inn et desimaltall til");

        double innTall1= Double.parseDouble(innStreng1);
        double innTall2= Double.parseDouble(innStreng2);
        double divisjon = innTall1 / innTall2;
        showMessageDialog(null,innTall1+" delt på "+ innTall2 + " blir "+ divisjon);

        String innStreng3= showInputDialog("Skriv inn et heltall");
        String innStreng4= showInputDialog("Skriv inn et heltall");
        int innTall3=Integer.parseInt(innStreng3);
        int innTall4=Integer.parseInt(innStreng4);
        int divisjon1 = innTall3/innTall4;
        showMessageDialog(null,innTall3+ " delt på "+ innTall4+ " blir "+ divisjon1);



    }
}
