package latihan_pbo.latihan4;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String namaMakanan, double harga, int jumlah) {
        super(namaMakanan, harga);
        this.jumlah = jumlah;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pesan : " + jumlah);
    }

    // Implementasi Polymorphism: Mengubah fungsi hitungTotal
    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }
}