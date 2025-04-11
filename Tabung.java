package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung() {
        setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
    
    public double getLuasAlas() {
        return (PEMBILANG * radius * radius) / (double) PENYEBUT;
    }

    public double getKeliling() {
        return (2 * PEMBILANG * radius) / (double) PENYEBUT;
    }
}