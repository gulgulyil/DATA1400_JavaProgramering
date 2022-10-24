package firstsemester.uke7.klasse;

public class multiplikasjonstabelen {
    public static void main(String[] args) {
        int produkt;
        for(int i=0; i<10; i++){
            for (int j =0; j<10; j++){
                int mult=i*j;
                System.out.println(i+" x "+j+" = "+mult);
            }

            System.out.println("\t");
        }
    }

}
