package firstsemester.uke6_klasser_objektor.oppgaver;

import static javax.swing.JOptionPane.*;

class BensinKjøp{

    private String Bensinstasjonens_sted;
    private String BensinType;
    private Double AntallLyterFylt;
    private Double PrisenPrLiter;
    private String TidPunktFylt;

    /*public BensinKjøp(String bensinstasjonens_sted, String bensinType, Double antallLyterFylt, Double prisenPrLiter, String tidPunktFylt) {
       this.Bensinstasjonens_sted = bensinstasjonens_sted;
       this.BensinType = bensinType;
       this.AntallLyterFylt = antallLyterFylt;
       this.PrisenPrLiter = prisenPrLiter;
       this.TidPunktFylt = tidPunktFylt;
    }
  */
    public String getBensinstasjonens_sted(){
    return Bensinstasjonens_sted;
    }

    public String getBensinType() {
        return BensinType;
    }

    public Double getAntallLyterFylt() {
        return AntallLyterFylt;
    }

    public Double getPrisenPrLiter() {
        return PrisenPrLiter;
    }

    public String getTidPunktFylt() {
        return TidPunktFylt;
    }

    public void setBensinstasjonens_sted(String bensinstasjonens_sted) {
        Bensinstasjonens_sted = bensinstasjonens_sted;
    }

    public void setBensinType(String bensinType) {
        BensinType = bensinType;
    }

    public void setAntallLyterFylt(Double antallLyterFylt) {
        AntallLyterFylt = antallLyterFylt;
    }

    public void setPrisenPrLiter(Double prisenPrLiter) {
        PrisenPrLiter = prisenPrLiter;
    }

    public void setTidPunktFylt(String tidPunktFylt) {
        TidPunktFylt = tidPunktFylt;
    }

    public double prisenn (double prisenPrLiter,double antallLyterFylt){
        double prisenD = prisenPrLiter * antallLyterFylt;
        return prisenD;
    }
}
public class oppgave3 {

    public static void main(String[] args){

        BensinKjøp bensinKjøp= new BensinKjøp();
        bensinKjøp.setBensinstasjonens_sted("Shell");
        bensinKjøp.setBensinType("Disel");
        bensinKjøp.setAntallLyterFylt(30.00);
        bensinKjøp.setPrisenPrLiter(19.20);
        bensinKjøp.setTidPunktFylt("18:00");
        double prisenn= bensinKjøp.prisenn(bensinKjøp.getPrisenPrLiter(), bensinKjøp.getAntallLyterFylt());
        String prisennS=String.format("%.2f",prisenn);

        String ut= "Bensin StasjonensSted = "+bensinKjøp.getBensinstasjonens_sted()+"\n"+
                "Bensin Type= "+bensinKjøp.getBensinType()+"\n"+
                "Antal Lytter Fylt= "+bensinKjøp.getAntallLyterFylt()+"\n"+
                "Prisen Per Liter = "+bensinKjøp.getPrisenPrLiter()+"\n"+
                "Tid Punkt Fylt= "+bensinKjøp.getTidPunktFylt()+"\n";

        showMessageDialog(null,ut);
        showMessageDialog(null,prisennS);
        //bensinKjøp.prisenn(bensinKjøp.getPrisenPrLiter(), bensinKjøp.getAntallLyterFylt());

    }


    /*
    Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen.
Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
     */

}
