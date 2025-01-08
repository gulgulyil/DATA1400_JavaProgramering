package firstsemester.uke13_Arv.forelesing;

class Person{
    public String navn;
    public String adresse;
    public String telefonnr;
}

//arv

class Student extends Person{
    public String sNummer;
    public String studieNavn;
}

class Ansatt2 extends Person{
    public String ansattVedInstitutt;
}

//composition

class Student1{
    public String sNummer;
    public String studieNavn;
    public Person person;
}

class Ansatt3{
    public String ansattVedInstitutt;
    public Person person;

}

public class Studie {

    public static void main(String[] args) {
        Student enStudent= new Student();
        enStudent.navn="Ole";
        Student1 enAnnenStudent=new Student1();
        enAnnenStudent.person.navn="Per";
        Ansatt3 enAnsatt=new Ansatt3();
        enAnsatt.person.navn="Line";
        enAnsatt.ansattVedInstitutt="IT";
        Ansatt2 enAnnenAnsat=new Ansatt2();
        enAnnenAnsat.navn="Kari";
        enAnnenAnsat.ansattVedInstitutt="MEK";
    }
}
