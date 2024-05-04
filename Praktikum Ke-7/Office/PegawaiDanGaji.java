package Office;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        Payroll payroll = new Payroll();

        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
    
}
