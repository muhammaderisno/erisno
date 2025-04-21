public class array2dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2 dimensi 3x3
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan isi array 2 dimensi
        System.out.println("Isi Matriks:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

