package firstsemester.uke9_Array2.skolen;

public class Plenum_kode_10 {
    public static void main(String[] args) {
        int[][] tabell=new int[2][2];
        tabell[0][0]=2;
        tabell[0][1]=3;
        tabell[1][0]=4;
        tabell[1][1]=5;

        int[][]tabell1={{2,3},{4,5}};

        for(int i=0;i<tabell.length;i++){
            for(int j=0; j<tabell[0].length;j++){
                System.out.println(tabell1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------");
        for (int[] liste : tabell1){
            for(int tall: liste){
                System.out.println(tall+"\t");
            }
            System.out.println();
        }
        //tabell[0][3] = 23;// fører til exception ved kjøring
        String[][] tabell2={{"rød","blå"},{"gul","grønn","svart"}};
        tabell2[0][1]=null;
        System.out.println("---------");
        for(String[] liste : tabell2){
            for(String farge: liste){
                System.out.println(farge+"\t");
            }
            System.out.println();
        }
    }
}
