package Office;

public class Manager extends Pegawai {
    private int tunjangan;

    public Manager(String nama) {
        super(nama);
        this.tunjangan = 7000000;
    }

    public int getTunjangan() {
        return this.tunjangan;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + getTunjangan());
    }
}