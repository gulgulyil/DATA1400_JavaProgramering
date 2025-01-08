package firstsemester.uke7.AndreOppgaver;
/*
Lag et program som viser følgene ut (med tab):
N       N^2       N^3        N^4
1            1           1             1
2            4           8             16
3            9           27           81
..... frem til N=10.
Bruk gjerne metoden i Java : MATH.pow(grunntall, eksponent).

 */
public class oppgave6 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=4; j++){
                System.out.print(Math.pow(i,j)+"\t");
            }
            System.out.println();
        }

        String ut="N\tN^2\tN^3\tN^4\n";
        for(int i=1; i<=10; i++){
            ut+=i+"\t"+Math.pow(i,2)+"\t"+Math.pow(i,3)+"\t"+Math.pow(i,4)+"\t\n";
        }
        System.out.println(ut);
    }
}
