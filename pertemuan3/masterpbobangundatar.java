// Simpan file ini sebagai masterpbobangundatar.java

class BangunDatar {
    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class masterpbobangundatar {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);

        System.out.println("Persegi");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());

        System.out.println("\nLingkaran");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
    }
}
