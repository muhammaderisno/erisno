/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author user
 */
public class methodfungsi {
    
}
public class methodFungsi {

    // Method fungsi untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas; // Mengembalikan hasil
    }

    // Method fungsi untuk menghitung keliling persegi
    public static int hitungKelilingPersegi(int sisi) {
        int keliling = 4 * sisi;
        return keliling; // Mengembalikan hasil
    }

    public static void main(String[] args) {
        int sisi = 5; // Misal panjang sisi = 5

        int luas = hitungLuasPersegi(sisi);
        int keliling = hitungKelilingPersegi(sisi);

        System.out.println("Sisi persegi: " + sisi);
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }
}
