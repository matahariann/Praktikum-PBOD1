public class MTitik {
    public static void main(String[] args) {
        Titik titik1 = new Titik(3, 4);
        Titik titik2 = new Titik();
        titik2.setAbsis(1);
        titik2.setOrdinat(2);

        System.out.println("Titik1 = (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        System.out.println("Titik2 = (" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")\n");

        // refleksiX
        titik1.getRefleksiX();
        titik2.getRefleksiX();
        System.out.println("Refleksi titik1 terhadap sumbu x = (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        System.out.println("Refleksi titik2 terhadap sumbu x = (" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")\n");

        // refleksiY
        titik1.getRefleksiY();
        titik2.getRefleksiY();
        System.out.println("Refleksi titik1 terhadap sumbu y = (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        System.out.println("Refleksi titik2 terhadap sumbu y = (" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")\n");
        
        // getJarakPusat
        System.out.println(String.format("Jarak titik1 ke titik pusat (0, 0) = %.2f", titik1.getJarakPusat()));
        System.out.println(String.format("Jarak titik1 ke titik pusat (0, 0) = %.2f", titik2.getJarakPusat()));
    }
}
