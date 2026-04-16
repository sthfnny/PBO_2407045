package latihan_pbo.Tugas4;

public class BangunDatar {
    protected double varA;
    protected double varB;

    // Constructor dengan 2 parameter 
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor dengan 1 parameter 
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Encapsulation: Getter dan Setter 
    public double getVarA() { return varA; }
    public void setVarA(double varA) { this.varA = varA; }
    public double getVarB() { return varB; }
    public void setVarB(double varB) { this.varB = varB; }

    // Method hitungLuas default 0 [cite: 8]
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan [cite: 9]
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("================");
    }
}