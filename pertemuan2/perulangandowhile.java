import java.util.Scanner;

public class perulangandowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        // Perulangan do-while
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();

            // Menampilkan angka yang dimasukkan
            if (angka != 0) {
                System.out.println("Angka yang dimasukkan: " + angka);
            }
        } while (angka != 0);  // Kondisi untuk mengulang perulangan

        System.out.println("Program selesai!");

        input.close();
    }
}
