package firstsemester.uke3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class eks4 {

    public static void main(String[] args) {
        String innStreng3= showInputDialog("Skriv inn et heltall");
        String innStreng4= showInputDialog("Skriv inn et heltall");
        int innTall3=Integer.parseInt(innStreng3);
        int innTall4=Integer.parseInt(innStreng4);
        int divisjon1 = innTall3/innTall4;
        showMessageDialog(null,innStreng3+ " delt på "+ innTall4+ " blir "+ divisjon1);
    }
}
