/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author user
 */
public class contohmethod {
    
}
public class ContohMethod {

    // Method tanpa parameter dan tanpa return value
    public static void salam() {
        System.out.println("Halo, selamat datang!");
    }

    // Method dengan parameter
    public static void salamNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method dengan parameter dan return value
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method utama (main method)
    public static void main(String[] args) {
        // Memanggil method tanpa parameter
        salam();

        // Memanggil method dengan parameter
        salamNama("Andi");

        // Memanggil method dengan parameter dan menangkap return value
        int hasil = tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
