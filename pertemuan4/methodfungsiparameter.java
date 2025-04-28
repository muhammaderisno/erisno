/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class methodfungsiparameter {

    // Method fungsi: menghitung luas lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    // Method fungsi: menghitung volume balok
    public static double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung luas lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = hitungLuasLingkaran(jariJari);
        System.out.println("Luas lingkaran adalah: " + luas);

        // Menghitung volume balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double volume = hitungVolumeBalok(panjang, lebar, tinggi);
        System.out.println("Volume balok adalah: " + volume);

        input.close();
    }
}
