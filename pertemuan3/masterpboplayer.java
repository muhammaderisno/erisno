// Simpan file ini dengan nama ProgramMasterPBOPlayer.java

// Kelas Player - kelas induk
class Player {
    protected String nama;
    protected int usia;

    public Player(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Method untuk menampilkan informasi dasar player
    public void infoPlayer() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }

    // Method umum untuk beraksi
    public void aksi() {
        System.out.println(nama + " sedang beraksi...");
    }
}

// Kelas FootballPlayer - turunan dari Player
class FootballPlayer extends Player {
    private String posisi;

    public FootballPlayer(String nama, int usia, String posisi) {
        super(nama, usia);
        this.posisi = posisi;
    }

    // Override method untuk info player
    @Override
    public void infoPlayer() {
        super.infoPlayer();
        System.out.println("Posisi di lapangan: " + posisi);
    }

    // Override aksi khusus untuk pemain sepak bola
    @Override
    public void aksi() {
        System.out.println(nama + " sedang bermain sepak bola di posisi " + posisi + "!");
    }
}

// Kelas BasketballPlayer - turunan dari Player
class BasketballPlayer extends Player {
    private double tinggiBadan;

    public BasketballPlayer(String nama, int usia, double tinggiBadan) {
        super(nama, usia);
        this.tinggiBadan = tinggiBadan;
    }

    // Override method untuk info player
    @Override
    public void infoPlayer() {
        super.infoPlayer();
        System.out.println("Tinggi badan: " + tinggiBadan + " cm");
    }

    // Override aksi khusus untuk pemain basket
    @Override
    public void aksi() {
        System.out.println(nama + " sedang bermain basket dengan tinggi badan " + tinggiBadan + " cm!");
    }
}

// Kelas utama untuk menjalankan program
public class MasterPBOPlayer {
    public static void main(String[] args) {
        // Membuat objek player sepak bola dan pemain basket
        Player player1 = new FootballPlayer("Cristiano Ronaldo", 37, "Forward");
        Player player2 = new BasketballPlayer("LeBron James", 40, 206);

        // Menampilkan info dan aksi masing-masing player
        System.out.println("== Informasi Pemain Sepak Bola ==");
        player1.infoPlayer();
        player1.aksi();

        System.out.println("\n== Informasi Pemain Basket ==");
        player2.infoPlayer();
        player2.aksi();
    }
}
