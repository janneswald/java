package Fahrzeug;
import java.util.ArrayList;
public class FahrzeugTest {
    public static void main(String [] args) {
        Fahrzeug auto = new Auto("BMW", 2020, 150);
        Fahrzeug auto2 = new Auto("BMW",2020, 150 );
        Auto auto3 = new Auto("Opel", 2023, 100);
        System.out.println(auto);
        auto.fahre();
        auto.toString();
        Fahrzeug brum = new Fahrrad("BMW", "gelb");
        if (brum.equals(auto)) {
            System.out.println("true");
        } else {
            System.out.println("fals");
        }
        if (auto.equals(auto2)) System.out.println("Equal");
        else if (auto.equals(auto3)) System.out.println("Equal");
        else System.out.println("not");
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Auto("BMW", 2020, 150));
        System.out.println(fahrzeuge.size());
        fahrzeuge.add(auto);
        fahrzeuge.add(auto2);
        fahrzeuge.add(auto3);
        System.out.println(fahrzeuge.get(3));
        System.out.println(fahrzeuge);
        System.out.println(fahrzeuge.contains(auto));
        }
        
    }
    

