import java.util.Scanner;

public class percabanganswitchcase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angka hari (1-7)
        System.out.print("Masukkan angka hari (1-7): ");
        int hari = input.nextInt();

        // Percabangan switch-case
        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Input tidak valid! Harus antara 1 hingga 7.");
                break;
        }

        input.close();
    }
}
