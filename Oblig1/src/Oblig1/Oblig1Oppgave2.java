package Oblig1;

import static javax.swing.JOptionPane.*;

class Vare{

    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        setNavn(navn);
        setAntall(antall);
        setPris(pris);
    }
    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public int getAntall(){
        return antall;
    }
    public void setAntall(int antall){
        if(antall >= 0){
            this.antall = antall;
        }
    }
    public double getPris(){
        return pris;
    }
    public void setPris(double pris){
        if(pris >= 0){
            this.pris = pris;
        }
    }
    public double beregneTotalPris(int antall, double pris){
        double totalPris = pris * antall;
        return totalPris;
    }
}
public class Oblig1Oppgave2 {
    public static void main(String[] args){
        String navn1 = showInputDialog("Skriv navnet på vare1: ");
        String innAntall1 = showInputDialog("Skriv antall vare1: ");
        String innPris1 = showInputDialog("Angi prisen på vare1: ");

        int antall1;
        double pris1;

        String navn2 = showInputDialog("Skriv navnet på vare2: ");
        String innAntall2 = showInputDialog("Skriv antall på vare2: ");
        String innPris2 = showInputDialog("Angi prisen på vare2: ");

        int antall2;
        double pris2;

        try{
            antall1 = Integer.parseInt(innAntall1);
            pris1 = Double.parseDouble(innPris1);

            antall2 = Integer.parseInt(innAntall2);
            pris2 = Double.parseDouble(innPris2);
        }
        catch (Exception e){
            antall1 = 0;
            pris1 = 0;

            antall2 = 0;
            pris2 = 0;
        }

        // vare 1:
        Vare vare1 = new Vare(navn1,antall1,pris1);
        double totalpris1 = vare1.beregneTotalPris(antall1,pris1);
        System.out.println("Pris "+navn1+": "+totalpris1);

        //Vare2:
        Vare vare2 = new Vare(navn1,antall1,pris1);
        double totalpris2 = vare2.beregneTotalPris(antall2,pris2);
        System.out.println("Pris "+navn2+": "+totalpris2);

        //Total sum:
        double totaltÅBetale = totalpris1 + totalpris2;
        System.out.println("Totalt å betale: "+totaltÅBetale);

    }
}
