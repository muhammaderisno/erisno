// Kelas Mobil - kelas induk
abstract class Mobil {
    protected String merk;
    protected int kecepatanMaksimum;
    protected String bahanBakar;

    // Constructor untuk Mobil
    public Mobil(String merk, int kecepatanMaksimum, String bahanBakar) {
        this.merk = merk;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.bahanBakar = bahanBakar;
    }

    // Method abstrak untuk informasi mobil
    public abstract void tampilInfo();

    // Method untuk akselerasi mobil
    public void akselerasi() {
        System.out.println(merk + " sedang berakselerasi dengan kecepatan maksimum " + kecepatanMaksimum + " km/h.");
    }
}

// Kelas MobilSedan - turunan dari Mobil
class MobilSedan extends Mobil {
    private int jumlahPintu;

    // Constructor untuk MobilSedan
    public MobilSedan(String merk, int kecepatanMaksimum, String bahanBakar, int jumlahPintu) {
        super(merk, kecepatanMaksimum, bahanBakar);  // Memanggil constructor Mobil
        this.jumlahPintu = jumlahPintu;
    }

    // Override method untuk menampilkan info MobilSedan
    @Override
    public void tampilInfo() {
        System.out.println("Mobil Sedan");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/h");
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas MobilSUV - turunan dari Mobil
class MobilSUV extends Mobil {
    private int jumlahRoda;

    // Constructor untuk MobilSUV
    public MobilSUV(String merk, int kecepatanMaksimum, String bahanBakar, int jumlahRoda) {
        super(merk, kecepatanMaksimum, bahanBakar);  // Memanggil constructor Mobil
        this.jumlahRoda = jumlahRoda;
    }

    // Override method untuk menampilkan info MobilSUV
    @Override
    public void tampilInfo() {
        System.out.println("Mobil SUV");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/h");
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Kelas utama untuk menjalankan program
public class PBOMobil {
    public static void main(String[] args) {
        // Membuat objek MobilSedan dan MobilSUV
        Mobil mobilSedan = new MobilSedan("Toyota Camry", 180, "Bensin", 4);
        Mobil mobilSUV = new MobilSUV("Jeep Wrangler", 200, "Diesel", 4);

        // Menampilkan informasi dan akselerasi masing-masing mobil
        System.out.println("== Informasi Mobil Sedan ==");
        mobilSedan.tampilInfo();
        mobilSedan.akselerasi();

        System.out.println("\n== Informasi Mobil SUV ==");
        mobilSUV.tampilInfo();
        mobilSUV.akselerasi();
    }
}
