package latihanMedium;

public class TestSenjata{
    public static void main(String[] args) {
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(AK47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(M16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);

        System.out.println("====================================");

        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}