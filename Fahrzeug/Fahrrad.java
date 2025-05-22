package Fahrzeug;

public class Fahrrad extends Fahrzeug {
    private String farbe;
    public Fahrrad(String marke, String farbe) {
        super(marke);
        this.farbe = farbe;
    }
    @Override
    public void fahre() {
        super.fahre();
        System.out.println("brbrbr");
    }
}