// Program Terstruktur untuk Menampilkan Informasi Pemain

import java.util.Scanner;

public class PemogramanTersturuktur {
    
    // Fungsi untuk menampilkan informasi pemain sepak bola
    public static void tampilInfoFootballPlayer(String nama, String posisi, String tim) {
        System.out.println("Pemain Sepak Bola");
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Tim: " + tim);
    }

    // Fungsi untuk menampilkan informasi pemain bola basket
    public static void tampilInfoBasketballPlayer(String nama, String posisi, String tim) {
        System.out.println("Pemain Bola Basket");
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Tim: " + tim);
    }

    // Fungsi untuk aksi bermain sepak bola
    public static void bermainFootballPlayer(String nama, String posisi) {
        System.out.println(nama + " sedang bermain di posisi " + posisi + " di lapangan sepak bola.");
    }

    // Fungsi untuk aksi bermain bola basket
    public static void bermainBasketballPlayer(String nama, String posisi) {
        System.out.println(nama + " sedang bermain di posisi " + posisi + " di lapangan bola basket.");
    }

    public static void main(String[] args) {
        // Scanner untuk input data pemain
        Scanner scanner = new Scanner(System.in);
        
        // Input untuk pemain sepak bola
        System.out.print("Masukkan nama pemain sepak bola: ");
        String namaFootball = scanner.nextLine();
        System.out.print("Masukkan posisi pemain sepak bola: ");
        String posisiFootball = scanner.nextLine();
        System.out.print("Masukkan tim pemain sepak bola: ");
        String timFootball = scanner.nextLine();
        
        // Input untuk pemain bola basket
        System.out.print("Masukkan nama pemain bola basket: ");
        String namaBasketball = scanner.nextLine();
        System.out.print("Masukkan posisi pemain bola basket: ");
        String posisiBasketball = scanner.nextLine();
        System.out.print("Masukkan tim pemain bola basket: ");
        String timBasketball = scanner.nextLine();
        
        // Menampilkan informasi pemain sepak bola dan bola basket
        System.out.println("\n== Informasi Pemain Sepak Bola ==");
        tampilInfoFootballPlayer(namaFootball, posisiFootball, timFootball);
        bermainFootballPlayer(namaFootball, posisiFootball);

        System.out.println("\n== Informasi Pemain Bola Basket ==");
        tampilInfoBasketballPlayer(namaBasketball, posisiBasketball, timBasketball);
        bermainBasketballPlayer(namaBasketball, posisiBasketball);
        
        scanner.close();
    }
}
