package Oblig2;

import static javax.swing.JOptionPane.*;

class TallSpill{
    public int nyttTall(){
        int randomTall;
        randomTall = (int) (Math.random() * 201);
        return randomTall;
    }
    public void visMelding(String melding){
        showMessageDialog(null, melding);
    }
    private void forLite(int tall){
        visMelding(tall+" er for lite. Prøv igjen!");
    }
    private void forStort(int tall){
        visMelding(tall+" er for stort. Prøv igjen!");
    }
    public void kjørSpill(){
        int antall = 0;
        int random = nyttTall();
                int gjetning = -1;

        while (gjetning != random){
            antall ++;
            String melding = showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet:");

            try {
                gjetning = Integer.parseInt(melding);
            }
            catch (Exception e) {
                gjetning = 0;
            }
            if (random > gjetning){
                forLite(gjetning);
            }
            else if (random < gjetning){
                forStort(gjetning);
            }
            else{
                avsluttRunde(antall, gjetning);
            }


        }


    }
    public void avsluttRunde(int antall, int gjetning){
        visMelding(gjetning+" er riktig!"+"\n"+"Du gjettet riktig på "+antall+". forsøk.");
    }
}
public class Oblig2_Oppgave2 {

    public static void main(String[] args) {

        TallSpill tallspill1 = new TallSpill();
        tallspill1.kjørSpill();
    }
}
