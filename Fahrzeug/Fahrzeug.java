package Fahrzeug;
// Ziel: Du entwickelst ein kleines Programm mit einer Elternklasse „Fahrzeug“ und zwei abgeleiteten Klassen, z. B. „Auto“ und „Fahrrad“.

public abstract class Fahrzeug {
    protected String marke;
    protected int baujahr;

    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }
     public Fahrzeug(String marke) {
        this.marke = marke;
    }

    public void fahre() {
        System.out.println("brum brum");
    }
    public String toString() {
        return marke + baujahr;
    }

    }






