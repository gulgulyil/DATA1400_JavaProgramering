package firstsemester.Eksamen.Programmering_2020_2;

class KonverTemperatur{

        public static double tilCelsius(double innFahrenheit){
            return (innFahrenheit-32)/1.8;
        }

        public static double tilFahrenheit(double innCelsius){

            return (innCelsius*1.8+32);
        }
}

public class Oppgave2 {

    public static void main(String[] args) {
        double celcius=35;

        double tilfahrenheit= KonverTemperatur.tilFahrenheit(celcius);
        System.out.println(celcius+" celcius grader blir "+String.format("%.2f",tilfahrenheit)+" fahrenheit grader");

        double fahrenheit=100;
        double tilcelcius=KonverTemperatur.tilCelsius(fahrenheit);
        System.out.println(String.format("%.2f",tilcelcius));
    }
}
