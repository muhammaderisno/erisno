// Simpan file ini sebagai ProgramMasterPBOMobil.java

class Mobil {
    protected String merk;
    protected String warna;

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void infoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
    }

    public void suaraMesin() {
        System.out.println("Suara mesin standar...");
    }
}

class MobilSedan extends Mobil {
    private int jumlahKursi;

    public MobilSedan(String merk, String warna, int jumlahKursi) {
        super(merk, warna);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void infoMobil() {
        super.infoMobil();
        System.out.println("Jenis: Sedan");
        System.out.println("Jumlah kursi: " + jumlahKursi);
    }

    @Override
    public void suaraMesin() {
        System.out.println("Suara mesin halus khas sedan...");
    }
}

class MobilTruk extends Mobil {
    private double kapasitasMuatan;

    public MobilTruk(String merk, String warna, double kapasitasMuatan) {
        super(merk, warna);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void infoMobil() {
        super.infoMobil();
        System.out.println("Jenis: Truk");
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
    }

    @Override
    public void suaraMesin() {
        System.out.println("Suara mesin berat khas truk...");
    }
}

public class MasterPBOMobil {
    public static void main(String[] args) {
        Mobil sedan = new MobilSedan("Honda Civic", "Merah", 4);
        Mobil truk = new MobilTruk("Isuzu Elf", "Putih", 5.0);

        System.out.println("== Informasi Mobil Sedan ==");
        sedan.infoMobil();
        sedan.suaraMesin();

        System.out.println("\n== Informasi Mobil Truk ==");
        truk.infoMobil();
        truk.suaraMesin();
    }
}
