package firstsemester.uke4_Aritmetikk.oppgave;

public class oppgave9 {
    /*
    Hva gir de ulike logiske uttrykkene under (anngi om de blir true eller false etter kolon):
sett tall1 = 5
sett tall2 = 4
tall1 == tall2 : ?
tall1 != tall2 : ?
tall1 <= tall2 : ?
tall1 >= tall2 : ?
tall1 < tall2  : ?
tall1 > tall2  : ?

     */

    public static void main(String[] args) {

        Integer tall1 = 5;
        Integer tall2 = 4;
        System.out.println(tall1==tall2);//False
        System.out.println(tall1!=tall2);//True
        System.out.println(tall1<=tall2);//False
        System.out.println(tall1>=tall2);//True
        System.out.println(tall1<tall2);//False
        System.out.println(tall1>tall2);//True

    }
}
