package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        // Objek Menu (Hanya menampilkan data dasar)
        Menu m1 = new Menu("Nasi Goreng Polindra", 15000);
        System.out.println("=== INFO MENU ===");
        m1.tampilkanInfo();
        System.out.println("Total (Base): " + m1.hitungTotal());

        System.out.println("\n---------------------------\n");

        // Objek MenuItem (Polymorphism dalam aksi)
        Menu m2 = new MenuItem("Ayam Penyet", 20000, 3);
        System.out.println("=== DETAIL PESANAN ===");
        m2.tampilkanInfo();
        System.out.println("Total Bayar  : Rp " + m2.hitungTotal());
    }
}