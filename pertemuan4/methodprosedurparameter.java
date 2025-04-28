import java.util.Scanner;  // Pastikan ini ada!

public class MethodProsedurParameter {

    // Method prosedur dengan parameter: Menampilkan ucapan selamat ulang tahun
    public static void ucapanUlangTahun(String nama, int usia) {
        System.out.println("Selamat ulang tahun, " + nama + "!");
        System.out.println("Semoga panjang umur dan sukses selalu di usia " + usia + " tahun!");
    }

    // Method prosedur dengan parameter: Menampilkan info mahasiswa
    public static void tampilkanInfoMahasiswa(String nama, int usia, String jurusan) {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jurusan: " + jurusan);
    }

    // Method prosedur dengan parameter: Menampilkan pesan selamat datang
    public static void tampilkanSalam(String nama) {
        System.out.println("Selamat datang, " + nama + "!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input untuk nama, usia, dan jurusan mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan usia mahasiswa: ");
        int usia = input.nextInt();
        input.nextLine();  // Clear newline
        
        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = input.nextLine();

        // Memanggil method prosedur dengan parameter
        tampilkanSalam(nama);
        tampilkanInfoMahasiswa(nama, usia, jurusan);
        ucapanUlangTahun(nama, usia);

        input.close();
    }
}
