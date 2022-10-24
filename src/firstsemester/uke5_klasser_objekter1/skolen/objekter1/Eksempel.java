package firstsemester.uke5_klasser_objekter1.skolen.objekter1;

class Person{
    public String navn( String fornavn, String etternavn){
        String navn=fornavn+ " " + etternavn;
        return navn;
    }
}

class Personn{

    public String navn;
    public int fødtselsår;

    public void alder(){
        int alder = 2022-fødtselsår;
        System.out.println(alder + "år");
    }
}

public class Eksempel {
    public static void main (String[] args) {
        Person enPerson= new Person();
        String etNavn = enPerson.navn("Lene","jensen");
        System.out.println(etNavn);

        Personn person1 = new Personn();
        person1.navn= "line Jensen";
        person1.fødtselsår=1999;
        System.out.println(person1.navn+" er");
        person1.alder();
    }
}
