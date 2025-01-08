package firstsemester.Oppgave4;

/*
Klasser,  objekter og arrays.

Lag en klasse kalt «SjekkArray». Denne skal ha en statisk metode som heter «summer». Denne metoden tar to heltall og et
heltalls-array som innparametere og returnerer et heltall med summen. Lag kode for å summere arryet fra posisjonen fra
og med første parameter til og med posisjonen oppgitt som andre parameter.
Lag en ny statisk metode i klassen kalt «arrayLike». Denne metoden skal ta to heltall-arrays inn og sjekke om de er
like (et og et element er likt). Dersom de er det (og like lange) så returnerer metoden «true», ellers «false».
Lag kode for å sjekke to arrays med denne metoden i main-metoden.
Lag så en ny statisk metode kalt «arrayEksisterer» som skal finne ut av om det finnes et tall i et oppgitt array.
Metoden skal ha et array inn og så et heltall som man skal sjekke om ligger i arrayet. Metoden skal returnere «true»
eller «false» avhengig av om tallet finnes eller ikke. Lag kode for å sjekke om et tall eksisterer med denne metoden
i main-metoden
 */

class SjekkArray{


    public static int summer(int tall1, int tall2, int[]listTall){
        int sum=0;
        if(tall1>0 && tall2<listTall.length){
        for (int i=tall1;i<tall2;i++){
            sum+=listTall[i];
            }
        }
        return sum;
    }

    /*
    public static boolean arrayLike(int[] listTall1,int[] listeTall2){
        boolean b=false;
        if(listTall1.length==listeTall2.length){
            for(int i=0;i<listeTall2.length;i++){
                if(listTall1[i]==listeTall2[i]){
                    b=true;
                }
                    b=false;
            }
        } b=false;
        return b;
    }
     */

    public static boolean arrayLike(int[] liste1, int[] liste2){
        if(liste1.length != liste2.length){
            return false;
        }
        for (int i=0; i<liste1.length;i++){
            if(liste1[i]!=liste2[i]){
                return false;
            }
        }
        return true;
    }

    static boolean arrayExists(int[]listTall,int tall){
        boolean b=false;
        for(int i :listTall){
            if(i==tall){
                b=true;
            }
        }
        return b;
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
        int[] list1={0,1,2,3,4,5};
        int[] liste2={0,1,2,3,4,5};
        int[] liste3={1,2,3,4,5,6,7};
        int[] liste4={1,2,3,4,5,6};
        int[] liste5={2,4,6,12,78,45,3,42,5,-7};
        int tall1=1;
        int tall2=5;
        int sum=SjekkArray.summer(tall1,tall2,liste5);
        int [] liste6={2,4,6,12,78,45,3,42,5,-8};

        if(SjekkArray.arrayLike(liste5,liste6)){
            System.out.println("Arreyene er like");
        }
        else{
            System.out.println("Arreyene er ikke like");
        }

        if(SjekkArray.arrayExists(list1,tall1)){
            System.out.println("Tallet "+tall1+" eksisterer i arraet");
        }
        else{
            System.out.println("Tallet "+tall1+" eksisterer IKKE i arrayet");
        }

        System.out.println("Summen av liste5 fra "+tall1+" til "+ tall2+" = "+sum);

        System.out.println("list1 og list2 er like : "+SjekkArray.arrayLike(list1,liste2));
        System.out.println("list1 og list3 er like : "+SjekkArray.arrayLike(list1,liste3));
        System.out.println("list1 og list4 er like : "+SjekkArray.arrayLike(list1,liste4));
    }
}
