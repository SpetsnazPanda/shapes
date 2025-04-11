package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3.0;
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((sisi / 2.0) * (sisi / 2.0) + getTinggi() * getTinggi());
    }

    public double getLuasSegitiga() {
        return (sisi * getTinggiSegitiga()) / 2.0;
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }
}