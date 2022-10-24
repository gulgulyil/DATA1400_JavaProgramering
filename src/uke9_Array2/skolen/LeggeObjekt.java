package uke9_Array2.skolen;

import java.util.ArrayList;
import java.util.Collections;

class Person{
    public String navn;
    public int alder;
}
public class LeggeObjekt {

    public static void main(String[] args) {
        ArrayList<Person> personer = new ArrayList<>();
        Person ole = new Person();
        ole.navn ="Ole";
        ole.alder=23;
        personer.add(ole);
        Person line= new Person();
        line.navn = "Line";
        line.alder= 21;
        personer.add(line);
        for(Person enPerson : personer){
            System.out.println(enPerson.navn+" "+enPerson.alder);
        }

        for(int i=0; i<personer.size();i++){
            System.out.println(personer.get(i).navn+ " "+personer.get(i).alder);
        }

        int indeks=personer.indexOf(ole);
        //bir objenin listeteki numarasini bulmak
        System.out.println("Indeksen til objekt ole: "+indeks);

        //Collections.sort(personer);

        personer.remove(ole);
        //personer.remove(0); Silme islemi yapar
        for(Person enPerson : personer){
            System.out.println(enPerson.navn+" "+enPerson.alder);

        }
        personer.clear();
        //Butun objektleri siler

        if(personer.contains(ole)){
            System.out.println("Ole inn i liste");
        }else{
            System.out.println("Ole ikke i lisete");
        }
    }

}
