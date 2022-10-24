package firstsemester.uke6_klasser_objektor.oppgaver;

import javax.swing.*;


class Person3{

    private String  navn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public String getNavn(){
    return navn;

    }

    public String getEtternavn(){
        return etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void Skrivut(String navn,String etternavn, String adresse, String  telefonnr){
        String ut=navn + "\n" + etternavn + "\n"+ adresse + "\n" + telefonnr + "\n";
        JOptionPane.showMessageDialog(null,ut);
    }
}



public class oppgave1 {

    public static void main(String[] args) {
        Person3 person= new Person3();
        person.setNavn(JOptionPane.showInputDialog("Skriv navnet ditt"));
        person.setEtternavn(JOptionPane.showInputDialog("Skriv etternavnet ditt"));
        person.setAdresse(JOptionPane.showInputDialog("Skriv adresen din"));
        person.setTelefonnr(JOptionPane.showInputDialog("Skriv telefonnummer"));
        person.Skrivut(person.getNavn(), person.getEtternavn(), person.getAdresse(), person.getTelefonnr());


    }
}
