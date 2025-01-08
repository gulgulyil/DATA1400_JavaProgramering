package firstsemester.Eksamen.Programmering_2020_1;

class Person{
    private String navn;
    private String personnummer;
    private int alder;

    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    //Skriv en konstruktør for attributtene>
    //Skriv en toString() metode>


    public String toString(){
        String ut="Navn : "+navn+"\n"
                +"PersonNummer : "+personnummer+"\n"
                +"Alder : "+alder;
        return ut;
    }
}
class Pasient extends Person{
    private String diagnose;

    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }
    //Skriv en konstruktør>
    //Skriv en toString() metode>
    public String toString(){
        String ut="Pasient : "+super.toString()+"\n"
                +"Diagnose : "+diagnose+"\n"+
                "--------------------------"+"\n";
        return ut;
    }
}
class Lege extends Person{
    //Opprett et pasient-array med 100 plasser>
    Pasient[] pasientlist=new Pasient[100];

    public Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }
    //Opprett en konstruktør>
    //Skriv en toString() metode>

    public String toString(){
        String ut="Lege: "+"\n"+
                super.toString()+"\n"+
                "\n";
        for(Pasient p:pasientlist){
            if(p!=null) {
                ut += p;
            }
        }

        return ut;
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
//Opprett to pasienter med deres egne diagnoser>
//Opprett en lege>
//Legg de to pasientene inn i legens pasient-array>
//Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>
        Pasient pasient1=new Pasient("Helen","123244",35,"diabetes");
        Pasient pasient2=new Pasient("Olav","324565",90,"alzheimers");

        Lege lege1=new Lege("Kari","21245",45);

        lege1.pasientlist[0]=pasient1;
        lege1.pasientlist[1]=pasient2;

        System.out.println(lege1);
    }
}
