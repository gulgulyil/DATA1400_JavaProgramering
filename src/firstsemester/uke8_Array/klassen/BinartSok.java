package firstsemester.uke8_Array.klassen;

public class BinartSok {

    public static int indeks(int[] liste, int nøkkel){
        int lav=0;
        int høy=liste.length-1;
        while(lav<=høy){
            //nøkkel er i listen eller ikke tilstede(return-1)
            int middel=lav+(høy-lav)/2;
            if(nøkkel<liste[middel]){
                høy=middel-1;
            }
            else if(nøkkel>liste[middel]){
                lav=middel+1;
            }
            else{
                return middel;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] primtall={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        //NB: Må være en liste som er sortert stigende!
        System.out.println("Tallet 43 er et primtall "+indeks(primtall,43));
        System.out.println("Tallet 42 er ikke et "+indeks(primtall,42));
    }
}
