package firstsemester.Eksamen.Programmering_2021_1;

import java.util.ArrayList;

class Person{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person(String navn, String adresse, String telefonnr) {
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String toString(){
        String ut;
        ut="Navn : "+navn+"\n"
                +"Adresse : "+adresse+"\n"
                +"Telefon nummer : "+telefonnr;
        return ut;
    }
}

class Student extends Person{
    private String studentnr;
    private String studienavn;

    public Student(String navn, String adresse, String telefonnr,String studentnr,String studienavn) {
        super(navn, adresse, telefonnr);
        this.studentnr=studentnr;
        this.studienavn=studienavn;
    }

    public String toString(){
        String ut=super.toString()+"\n"
                +"Student nummer : "+studentnr+"\n"
                +"Studentnavn : "+studienavn+"\n"
                +"----------------------------";
        return ut;
    }
}

class Ansatt extends Person{
    private String initutnavn;
    private Double lonn;

    public Ansatt(String navn, String adresse, String telefonnr, String initutnavn, Double lonn) {
        super(navn, adresse, telefonnr);
        this.initutnavn = initutnavn;
        this.lonn = lonn;
    }

    public String toString(){
        String ut=super.toString()+"\n"
                +"Initutnavn : "+initutnavn+"\n"
                +"Lønn : "+lonn+"\n"
                +"----------------------------";
        return ut;
    }
}
public class Oppgave4 {
    public static void main(String[] args) {

        ArrayList<Person> personList=new ArrayList<Person>();
        Person enStudent= new Student("Gulnur","Fredrikstad","123456","s12345","IT");
        Person enStudent1= new Student("Elif","Fredrikstad","123457","s12346","IT");
        Person enStudent2= new Student("Munu","Fredrikstad","123458","s12347","IT");
        Person enAnsatt=new Ansatt("Ole","Oslo","1111111","ITlærer",40.000);
        Person enAnsatt1=new Ansatt("Per","Oslo","1111112","ITlærer",40.000);
        personList.add(enStudent);
        personList.add(enStudent1);
        personList.add(enStudent2);
        personList.add(enAnsatt);
        personList.add(enAnsatt1);

    /*
        for(Person i: personList){
            System.out.println(i);
        }
    */
        for(int i=0; i<personList.size();i++){
            System.out.println(personList.get(i));
        }

    }
}
