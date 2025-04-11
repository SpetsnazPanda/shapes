package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas;
    private double kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKelinggi() * getTinggi();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }

    public double getTinggiAlas() {
        return Math.sqrt((kaki * kaki) - (alas / 2.0) * (alas / 2.0));
    }

    public double getLuasAlas() {
        return (alas * getTinggiAlas()) / 2.0;
    }

    public double getKelinggi() {
        return 2 * kaki + alas;
    }
}