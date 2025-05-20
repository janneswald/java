// Ziel: Eine Klasse, die Tiere mit Namen, Art und Geräusch simuliert.
public class Tier {
    // Attribute
    private String name;
    private String art;
    private String geraeusch;
    // Konstruktor
    public Tier(String name, String art, String geraeusch){
        this.name = name;
        this.art = art;
        this.geraeusch = geraeusch;
    }
    // Getter-Methoden
    public String getName() {
        return name;
    }
    public String getArt() {
        return art;
    }
    public String getGeraeusch() {
        return geraeusch;
    }
    // Methode zur Ausgabe der Tierinformationen
  public void ausgeben() {
    System.out.println("Name: " + getName());
    System.out.println("Art: " + getArt());
    System.out.println("Geräusch: " + getGeraeusch());
}
    // Main-Methode zum Testen der Klasse
    public static void main(String[] args) {
        Tier tier1 = new Tier("Affe", "Säugetier", "Ah Ah");
        Tier tier2 = new Tier("Hund", "Säugetier", "Wuff Wuff");

        tier1.ausgeben();
    }
}

class Hund extends Tier {
    public Hund(String name, String art, String geraeusch) {
        super(name, art, geraeusch);
    }
}
