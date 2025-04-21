public class array1dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 1 dimensi
        int[] angka = {5, 10, 15, 20, 25};

        // Menampilkan isi array
        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    }
}
