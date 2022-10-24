package firstsemester.uke4_Aritmetikk.oppgave;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class oppgave7 {
    /*
    Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
    Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
    Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren. Skriv ut resultatet på følgende form:
    ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.
     */
    public static void main(String[] args) {


        String antalPizza = showInputDialog("Skriv inn antall pizza");
        String antallPersoner = showInputDialog("Skriv inn antall personer");
        String antallSlicesPerPizza = showInputDialog("Skriv inn antall pizzas slice per pizza");
        Integer antalPizzaD = Integer.parseInt(antalPizza);
        Integer antallPersonerD = Integer.parseInt(antallPersoner);
        Integer antallSlicesPerPizzaD = Integer.parseInt(antallSlicesPerPizza);
        Integer pizzaSlice = antallSlicesPerPizzaD * antalPizzaD;
        Integer pizzaSHverPerson = pizzaSlice / antallPersonerD;
        Integer restenAvPizzaS = pizzaSlice % antallPersonerD;

        String ut = "Personer er " + antallPersoner + " og har " + antalPizza + " pizzaer får hver person " + pizzaSHverPerson + " slices og " + restenAvPizzaS + " blir til overs.";

        showMessageDialog(null,ut);

    }

}
