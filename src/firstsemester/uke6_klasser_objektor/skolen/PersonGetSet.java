package firstsemester.uke6_klasser_objektor.skolen;

class Personn{
    private int alder;

    public int getAlder(){
        return alder;
    }

    public void setAlder(int alder){
        if(alder>0){
            this.alder=alder;
        }
    }
}

public class PersonGetSet {

    public static void main(String[] args){
        Personn person1= new Personn();
        //person1.alder=23;
        person1.setAlder(23);
        System.out.println("Alderen er "+ person1.getAlder()+" år");

    }
}
