package firstsemester.Eksamen.Programmering_2020_2;


class Bok{
    private String tittel;
    private Forfatter forfatter;

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public Forfatter getForfatter() {
        return forfatter;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    public Bok(String tittel, Forfatter forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    @Override
    public String toString(){
       String ut="Tittel: "+tittel+"\n"+
       forfatter.toString()+"\n"+
               "---------------------";

       return ut;
    }
}

class Forfatter{
    private String navn;
    private String født;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFødt() {
        return født;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    public Forfatter(String navn, String født) {
        this.navn = navn;
        this.født = født;
    }

    @Override
    public String toString(){
        String ut="Forfatter :"+"\n"+
                "Navn: "+navn+"\n"+
                "Født: "+født;
        return ut;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Forfatter henrikIbsen=new Forfatter("Henrik Ibsen","1828");
        Bok dukkeHjem=new Bok("Dukke Hjem",henrikIbsen);
        Bok vildanden=new Bok("Vildanden",henrikIbsen);

        System.out.println(dukkeHjem);
        System.out.println(vildanden);
    }
}
