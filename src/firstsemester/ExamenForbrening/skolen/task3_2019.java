package firstsemester.ExamenForbrening.skolen;

import java.util.ArrayList;

class Bok{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel,String forfatter,double pris){
        this.tittel=tittel;
        this.forfatter=forfatter;
        this.pris=pris;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String toString(){
        return "Tittel: "+
                this.tittel+"\n"+
                "forfatter: "+this.forfatter+
                "\n pris: "+this.pris;

    }

}

        class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String tittel,String forfatter, double pris, int ISBN){
        super(tittel,forfatter,pris);
        this.ISBN=ISBN;
    }

            public int getISBN() {
                return ISBN;
            }

            public void setISBN(int ISBN) {
                this.ISBN = ISBN;
            }

            public String toString(){
                String ut= super.toString();
                ut+="\n ISBN: "+this.ISBN;
                return ut;
            }
        }


        class Lydbok extends Bok{
    private int lengdelminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdelminutter){
        super(tittel,forfatter,pris);
        this.lengdelminutter=lengdelminutter;
    }

    @Override
            public String toString(){
        return super.toString()+ "\n varighet "+ this.lengdelminutter+ "minutter: ";
    }
        }

public class task3_2019 {

    public static void main(String[] args) {
        ArrayList<Bok>boker = new ArrayList<>();
        Bok bok1= new Bok("Rød snø","Jon nesbø",120);
        boker.add(bok1);
        Papirbok papirbok= new Papirbok("Java: How to program early objects", "Oleary",800,1123581321);
        boker.add(papirbok);
        Lydbok lydbok=new Lydbok("Harry Petter","J.K Rowling",300,3000);
        boker.add(lydbok);
        for(Bok i: boker){
            System.out.println(i.toString()+" ");
        }

    }
}
