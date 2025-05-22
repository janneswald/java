package Fahrzeug;
public class Auto extends Fahrzeug {
    private int ps;
    public Auto(String marke, int baujahr, int ps) {
        super(marke, baujahr);
        this.ps = ps;
    }
    @Override
    public void fahre() {
        super.fahre();
        System.out.println("schschsch");
    }
    public String toString() {
        return super.toString() + ps;
    }

}