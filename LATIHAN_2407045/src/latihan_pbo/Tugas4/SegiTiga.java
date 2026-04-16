package latihan_pbo.Tugas4;

public class SegiTiga extends BangunDatar {
    public SegiTiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("================");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("================");
    }
}