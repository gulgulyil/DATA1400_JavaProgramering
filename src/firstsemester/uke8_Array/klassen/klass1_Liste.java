package firstsemester.uke8_Array.klassen;

public class klass1_Liste {
    public static void main(String[] args){
        int[] liste=new int[4];
        liste[0]=23;
        liste[1]=2;
        liste[2]=-4;
        liste[3]=5;
        String ut= "Her er tallene i listen : ";
        ut += liste[0] +" ";
        ut += liste[1] +" ";
        ut += liste[2] +" ";
        ut += liste[3] +" ";
        System.out.println(ut);
        //alternativ med en løkke
        for(int i=0;i<liste.length;i++){
            System.out.print(liste[i]+" ");
        }
    }
}
