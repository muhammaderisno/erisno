import java.util.Scanner;

public class PercabanganIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai dari user
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Percabangan if-else
        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }

        input.close();
    }
}
