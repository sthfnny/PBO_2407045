package latihan_pbo.latihan4;

public class Menu {
    protected String namaMakanan;
    protected double harga;

    public Menu(String namaMakanan, double harga) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Harga        : Rp " + harga);
    }

    // Method yang akan di-override (Polymorphism)
    public double hitungTotal() {
        return 0;
    }
}