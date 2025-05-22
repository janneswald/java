package Fahrzeug;
public class FahrzeugTest {
    public static void main(String [] args) {
        Fahrzeug auto = new Auto("BMW", 2020, 150);
        System.out.println(auto);
        auto.fahre();
        auto.toString();
        Fahrzeug brum = new Fahrrad("BMW", "gelb");
        if (brum.equals(auto)) {
            System.out.println("true");
        } else {
            System.out.println("fals");
        }
        if (1 == 1) {
            System.out.println("true");
        } else {
            System.out.println("fals");
        }
        }
    }

