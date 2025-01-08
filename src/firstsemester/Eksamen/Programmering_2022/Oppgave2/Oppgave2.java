package firstsemester.Eksamen.Programmering_2022.Oppgave2;

import java.util.ArrayList;

class Valuta{
    private String valuta;
    private double kurs;
    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }
    public String getValuta() {
        return valuta;
    }
    public double getKurs() {
        return kurs;
    }
}
class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
        Valuta usd = new Valuta("USD",8.60);
        valutakurser.add(usd);
        Valuta sek = new Valuta("SEK",98.00);
        valutakurser.add(sek);
        Valuta dkk=new Valuta("DKK",75.00);
        valutakurser.add(dkk);
    }
    public double beregnKurs(String valuta) {
        for(Valuta kurs : valutakurser){
            if(kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
        return 0;
    }
}
public class Oppgave2 {
    public static void main(String[] args){
        ValutaKalkulator k = new ValutaKalkulator();
        System.out.println("USD = "+String.format("%.2f",k.beregnKurs("USD")));
        System.out.println("SEK = "+String.format("%.2f",k.beregnKurs("SEK")));
        System.out.println("EUR = "+String.format("%.2f",k.beregnKurs("EUR")));
        System.out.println("DKK= "+String.format("%.2f", k.beregnKurs("DKK")));

    }
}
