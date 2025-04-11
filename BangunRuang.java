package utp.shapes;

public abstract class BangunRuang { 
    private String nama;
    private double tinggi;

    public BangunRuang() {}

    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public abstract double getLuasPermukaan();
    public abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama            : " + getNama());
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", getVolume());
    }
}