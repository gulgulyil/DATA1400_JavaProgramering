package firstsemester.uke11_KlassOgObjekterMer.forelesing;

class Person{
    public String navn;
}

public class ByRef {

    private static void endreNavn(Person personRef1, String navn){
        personRef1.navn=navn;
    }

    public static void main(String[] args){
        Person person1=new Person();
        person1.navn="Heidi";
        System.out.println("Navnet til person1 er "+person1.navn);
        endreNavn(person1,"Kari");
        System.out.println("Navnet til person1 er nå plutselig :) : "+person1.navn);
    }

}
