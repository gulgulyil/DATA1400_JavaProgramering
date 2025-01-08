package firstsemester.uke6_klasser_objektor.skolen;

class Personxx{
    private int alder;

    public Personxx(int alder){
        if(alder>0){
            this.alder=alder;
        }
    }

    public int getAlder(){
        return alder;
    }

    public void setAlder(int alder){
        if(alder>0){
            this.alder=alder;
        }
    }
}
public class Personx {

    public static void main(String[] args) {
        Personxx person1=new Personxx(23);
        person1.setAlder(24);
        System.out.println("Alderen er "+person1.getAlder()+" år.");
    }
}
