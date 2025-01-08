package firstsemester.uke3;

import static javax.swing.JOptionPane.*;

public class eks5 {

    public static void main(String[] args) {

        double tall;
        String innStreng = showInputDialog("Skriv inn et desimal tall");

        try {
            tall= Double.parseDouble(innStreng);

        }

        catch(Exception e) {

            tall = 0;
        }

        showMessageDialog(null,"Resultat: "+ tall);
    }
}
