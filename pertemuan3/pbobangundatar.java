// Simpan file ini dengan nama PBOBangunDatar.java

// Kelas BangunDatar - kelas induk
abstract class BangunDatar {
    // Method abstrak untuk menghitung luas
    public abstract double hitungLuas();
    
    // Method abstrak untuk menghitung keliling
    public abstract double hitungKeliling();
}

// Kelas Persegi - turunan dari BangunDatar
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Override method untuk menghitung luas persegi
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Override method untuk menghitung keliling persegi
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas Lingkaran - turunan dari BangunDatar
class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Override method untuk menghitung luas lingkaran
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Override method untuk menghitung keliling lingkaran
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

// Kelas utama untuk menjalankan program
public class PBOBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi dengan sisi 5
        BangunDatar persegi = new Persegi(5);
        // Membuat objek Lingkaran dengan radius 7
        BangunDatar lingkaran = new Lingkaran(7);

        // Menampilkan informasi Persegi
        System.out.println("== Persegi ==");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());

        // Menampilkan informasi Lingkaran
        System.out.println("\n== Lingkaran ==");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
    }
}
