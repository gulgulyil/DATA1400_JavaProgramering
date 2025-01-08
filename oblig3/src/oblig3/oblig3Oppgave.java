package oblig3;

import static javax.swing.JOptionPane.*;

class UnikeTall{

    public int[] arrayRandomTall;

    public UnikeTall(int antall){

        arrayRandomTall=new int[antall];
    }

    public boolean undersøke(int randomTall){
        boolean kontrol=false;
        for(int i=0;i<arrayRandomTall.length; i++){
            if(arrayRandomTall[i]==randomTall){
                kontrol=true;
            }
        }return kontrol;
    }

    public void fylleUtArray(){
        for(int i=0; i<arrayRandomTall.length;i++){
            int randomTall=(int)(Math.random()*(900)+100);
            if(undersøke(randomTall)==false){
                arrayRandomTall[i]=randomTall;
            }else{
                i--;
            }
        }
    }

    public static int min(int[] innArray){
        int minste=innArray[0];
        for(int tall:innArray){
            if(tall<minste){
                minste=tall;
            }
        }
        return minste;
    }

    public static int maks(int[] innArray){
        int største=innArray[0];
        for(int tall:innArray){
            if(tall>største){
                største=tall;
            }
        }
        return største;
    }

    public double gjennomsnitt(int[] innArray){
        double sum=0;
        double gjennomsnitt;
        double teller=0;
        for(int tall:innArray){
            sum+=tall;
            teller++;
        }
        gjennomsnitt=sum/teller;
        return gjennomsnitt;
    }

    public void SkriveUt(){
        String ut="";
        int teller=0;
        for(int tall:arrayRandomTall){
            ut+=tall+" ";
            teller++;
            if(teller%10==0){
                ut+="\n";
            }
        }
        ut+="\n"+"Minste tallet er "+min(arrayRandomTall)+"\n"+
                "Største tallet er "+maks(arrayRandomTall)+"\n"+
                "Gjennomsnittsverdien er "+String.format("%.2f",gjennomsnitt(arrayRandomTall));
        showMessageDialog(null,ut);
    }
}

public class oblig3Oppgave {

    public static void main(String[] args) {
        int antall=Integer.parseInt(showInputDialog("Skrivv in antall til arrayen"));
        UnikeTall tilfeldig = new UnikeTall(antall);
        tilfeldig.fylleUtArray();
        tilfeldig.SkriveUt();
    }
}
