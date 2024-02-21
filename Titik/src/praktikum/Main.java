package praktikum;

public class Main {

    public static void main(String[] args) {
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        Titik titik3 = new Titik(5,6);

        titik1.setAbsis(1);
        titik1.setOrdinat(2);

        titik2.setAbsis(3);
        titik2.setOrdinat(4);
        
        System.out.println("Titik1 = (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        System.out.println("Titik2 = (" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")");
        System.out.println("Titik2 = (" + titik3.getAbsis() + ", " + titik3.getOrdinat() + ")");
        System.out.println("Jumlah objek titik : " + titik3.getCounter());
        
    }
}