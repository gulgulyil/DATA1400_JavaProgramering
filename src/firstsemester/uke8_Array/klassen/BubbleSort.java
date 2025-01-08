package firstsemester.uke8_Array.klassen;

public class BubbleSort {
    public static void boblesort(int[] liste){
        int n= liste.length;
        int k;
        for(int m=n; m>=0; m--){
            for(int i=0;i<n-1;i++){
                k=i+1;
                if(liste[i]>liste[k]){
                    swapNummer(i,k,liste);
                }
            }
            skrivNummer(liste);
        }
    }

    private static void skrivNummer(int[] liste) {
        for(int tall:liste){
            System.out.println(tall+", ");
        }
        System.out.println("\n");
    }

    private static void swapNummer(int i, int j, int[] liste) {
        int temp;
        temp=liste[i];
        liste[i]=liste[j];
        liste[j]=temp;
    }

    public static void main(String[] args) {
        int[] input={4,2,9,6,23,12,34,0,1};
        boblesort(input);
    }
}
