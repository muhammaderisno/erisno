import java.util.Scanner;

public class MethodProsedur {

    // Method prosedur untuk menampilkan salam
    public static void tampilkanSalam() {
        System.out.println("Selamat datang di program Java!");
    }

    // Method prosedur untuk menampilkan informasi mahasiswa
    public static void tampilkanInfoMahasiswa(String nama, int usia, String jurusan) {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jurusan: " + jurusan);
    }

    // Method prosedur untuk menampilkan ucapan ulang tahun
    public static void ucapanUlangTahun(String nama) {
        System.out.println("Selamat ulang tahun, " + nama + "! Semoga panjang umur dan sukses selalu!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memanggil method prosedur untuk menampilkan salam
        tampilkanSalam();

        // Input data mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan usia mahasiswa: ");
        int usia = input.nextInt();
        input.nextLine();  // Clear newline
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = input.nextLine();

        // Memanggil method prosedur untuk menampilkan info mahasiswa
        tampilkanInfoMahasiswa(nama, usia, jurusan);

        // Memanggil method prosedur untuk ucapan ulang tahun
        ucapanUlangTahun(nama);

        input.close();
    }
}
