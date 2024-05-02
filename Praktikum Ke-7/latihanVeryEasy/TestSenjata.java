package latihanVeryEasy;

public class TestSenjata {
    
    public static void main(String[] args) {
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + AK47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        AK47.setPeluru(5);
        System.out.println("Jumlah Peluru Ak47: " + AK47.getPeluru());

        System.out.println("AK47 menembak");
        AK47.menembak();
    }
}
