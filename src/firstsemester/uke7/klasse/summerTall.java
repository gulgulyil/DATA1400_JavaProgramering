package firstsemester.uke7.klasse;
import static javax.swing.JOptionPane.*;

public class summerTall {
    public static void main(String[] args) {
        double sum=0;
        double tall= Double.parseDouble(showInputDialog("Skriv inn et positiv tall. Avslutt med 0"));
        while(tall<0){
            sum+=tall;
            tall=Double.parseDouble(showInputDialog("Skriv inn et positivt tall"));
        }
    }
}
