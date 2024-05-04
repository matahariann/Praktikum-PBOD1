package Office;

public class Pegawai {
    private String nama;
    private int gajiPokok;

    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 5000000;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + getNama() + ", Gaji Pokok: " + getGajiPokok());
    }
}