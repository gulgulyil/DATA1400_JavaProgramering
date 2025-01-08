package firstsemester.Eksamen.Programmering_2022.Oppgave3;

class Personalia {
    private String navn;
    private String adresse;
    private String telefonnr;
    public Personalia(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
    @Override
    public String toString() {
        return "Personalia{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnr='" + telefonnr + '\'' +
                '}';
    }
}
class Student{
    private Personalia personalia;
    private String studentnr;
    public Student(Personalia personalia, String studentnr) {
        this.personalia = personalia;
        this.studentnr = studentnr;
    }
    @Override
    public String toString() {
        return "Student {" +
                "personalia=" + personalia +
                ", studentnr='" + studentnr + '\'' +
                '}'+"\n" +"---------------------";
    }
}
class Ansatt{
    private Personalia personalia;
    private String tittel;
    public Ansatt(Personalia personalia, String tittel) {
        this.personalia = personalia;
        this.tittel = tittel;
    }
    @Override
    public String toString() {
        return "Ansatt {" +
                "personalia=" + personalia +
                ", tittel='" + tittel + '\'' +
                '}'+"\n" +"---------------------";
    }
}
public class Oppgave3 {
    public static void main(String[] args){
        Personalia per = new Personalia("Per Hansen",
                "Askerveien 82", "22334455");
        Personalia kari = new Personalia("Kari Olsen",
                "Osloveien 78", "66778899");
        Ansatt perHansen = new Ansatt(per,"Lektor");
        Student kariOlsen = new Student(kari,"S992233");
        Personalia olav=new Personalia("Olav","Bergen","23445");
        Personalia gulnur=new Personalia("Gulnur","Ski","122222");
        Student enStudent= new Student(per,"s333333");
        Ansatt enAnsatt=new Ansatt(gulnur,"IT");
        System.out.println(enAnsatt);
        System.out.println(enStudent);
        System.out.println(perHansen);
        System.out.println(kariOlsen);
    }
}
