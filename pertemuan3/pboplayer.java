// Kelas Player - kelas induk
abstract class Player {
    protected String nama;
    protected String posisi;

    public Player(String nama, String posisi) {
        this.nama = nama;
        this.posisi = posisi;
    }

    // Method abstrak untuk informasi pemain
    public abstract void tampilInfo();

    // Method untuk melakukan aksi bermain
    public void bermain() {
        System.out.println(nama + " sedang bermain di posisi " + posisi);
    }
}

// Kelas FootballPlayer - turunan dari Player
class FootballPlayer extends Player {
    private String tim;

    // Constructor untuk FootballPlayer dengan parameter yang benar
    public FootballPlayer(String nama, String posisi, String tim) {
        super(nama, posisi);  // Memanggil constructor Player
        this.tim = tim;
    }

    // Override method untuk menampilkan info pemain sepak bola
    @Override
    public void tampilInfo() {
        System.out.println("Pemain Sepak Bola");
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Tim: " + tim);
    }
}

// Kelas BasketballPlayer - turunan dari Player
class BasketballPlayer extends Player {
    private String tim;

    // Constructor untuk BasketballPlayer dengan parameter yang benar
    public BasketballPlayer(String nama, String posisi, String tim) {
        super(nama, posisi);  // Memanggil constructor Player
        this.tim = tim;
    }

    // Override method untuk menampilkan info pemain bola basket
    @Override
    public void tampilInfo() {
        System.out.println("Pemain Bola Basket");
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Tim: " + tim);
    }
}

// Kelas utama untuk menjalankan program
public class PBOPLayer {
    public static void main(String[] args) {
        // Membuat objek FootballPlayer dan BasketballPlayer
        Player footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Penyerang", "Manchester United");
        Player basketballPlayer = new BasketballPlayer("LeBron James", "Forward", "Los Angeles Lakers");

        // Menampilkan informasi dan aksi bermain masing-masing pemain
        System.out.println("== Informasi Pemain Sepak Bola ==");
        footballPlayer.tampilInfo();
        footballPlayer.bermain();

        System.out.println("\n== Informasi Pemain Bola Basket ==");
        basketballPlayer.tampilInfo();
        basketballPlayer.bermain();
    }
}

