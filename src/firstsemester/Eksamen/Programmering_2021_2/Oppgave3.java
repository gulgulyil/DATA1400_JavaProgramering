package firstsemester.Eksamen.Programmering_2021_2;

/*
Det er definert to klasser, Fag og Student. Se koden til venstre.
Lag et program som inneholder disse to klassene og en main-metode.
Lag konstruktører og get/set metoder for Fag og Student-klassene.
Lag toString() metoder i Fag- og Student-klassene slik at man får følgende ut på System.out når
det opprettes et array med 10 plasser i faget og det legges inn to studenter og man skriver ut et
fag:

 */

class Fag{
    private String fag;
    private int år;
    private Student[] studentslist;

    public Student[] getStudentslist() {
        return studentslist;
    }

    public void setStudentslist(Student[] studentslist) {
        this.studentslist = studentslist;
    }

    public String getFag() {
        return fag;
    }

    public void setFag(String fag) {
        this.fag = fag;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    public Fag(String fag, int år,Student[]studentslist) {
        this.fag = fag;
        this.år = år;
        this.studentslist=studentslist;
    }

    @Override
    public String toString(){
        String ut="Fag : "+fag+", "+" år : "+år+"\n";
        for(Student student:studentslist){
            if(student!=null){
                ut+=student+"\n";
            }
        }
        return ut;
    }
}

class Student{
    private String navn;
    private String studNr;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    @Override
    public String toString(){
        String ut="Student : Navn ="+navn+" StudNr = "+studNr;
        return ut;
    }
}
public class Oppgave3 {

    /*
Fag : Programmering, år : 2020
Student : Navn=Kari Olsen, StudNr=S234556
Student : Navn=Ole Hansen, StudNr=S356734
Skriv en main-metode for å få det overstående ut via System.out
     */

    public static void main(String[] args) {
        Student[] studentlist=new Student[10];
        Student student1= new Student("Kari Olsen","S234556");
        Student student2=new Student("Ole Hansen","S356734");
        studentlist[0]=student1;
        studentlist[1]=student2;
        Fag fag1=new Fag("Programmering",2020,studentlist);

        System.out.println(fag1);

    }
}
