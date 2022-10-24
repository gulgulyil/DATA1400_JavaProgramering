package firstsemester.uke6_klasser_objektor.skolen;

class Person{
    public String navn;
    public int fødtselsår;

    public Person (String navn, int fødselsår){
        this.navn= navn;
        this.fødtselsår = fødtselsår;
    }
}
public class PersonEksempel {

    public static void main(String[]args){
        Person person1= new Person("Line Jensen",1999);
        System.out.println(person1.navn+" er født i "+person1.fødtselsår);
    }
}
