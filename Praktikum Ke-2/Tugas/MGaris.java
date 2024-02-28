public class MGaris {

    public static void main(String[] args) {
        Garis garis1 = new Garis(new Titik(1,1), new Titik(7,7));
        // Garis garis2 = new Garis(new Titik(1,6), new Titik(6,1));
        Garis garis2 = new Garis();
        garis2.setTitikAwal(new Titik(1,6));
        garis2.setTitikAkhir(new Titik(6,1));

        System.out.println("Titik Garis1 = ((" + garis1.getTitikAwal().getOrdinat() + ", " + garis1.getTitikAwal().getAbsis() + "), (" + garis1.getTitikAKhir().getOrdinat() + ", " + garis1.getTitikAKhir().getAbsis() + "))");
        System.out.println("Titik Garis2 = ((" + garis2.getTitikAwal().getOrdinat() + ", " + garis2.getTitikAwal().getAbsis() + "), (" + garis2.getTitikAKhir().getOrdinat() + ", " + garis2.getTitikAKhir().getAbsis() + "))\n");
        

        // getPanjang
        System.out.println(String.format("Panjang Garis1 = %.2f", garis1.getPanjang()));
        System.out.println(String.format("Panjang Garis2 = %.2f \n", garis2.getPanjang()));

        // getPanjang
        System.out.println("Gradien Garis1 = " + garis1.getGradien());
        System.out.println("Gradien Garis2 = " + garis2.getGradien());
        System.out.print("\n");

        // getRefleksiY
        garis1.gettRefleksiY();
        garis2.gettRefleksiY();
        System.out.println("Refleksi Terhadap Y");
        System.out.println("Titik Garis1 = ((" + garis1.getTitikAwal().getOrdinat() + ", " + garis1.getTitikAwal().getAbsis() + "), (" + garis1.getTitikAKhir().getOrdinat() + ", " + garis1.getTitikAKhir().getAbsis() + "))");
        System.out.println("Titik Garis2 = ((" + garis2.getTitikAwal().getOrdinat() + ", " + garis2.getTitikAwal().getAbsis() + "), (" + garis2.getTitikAKhir().getOrdinat() + ", " + garis2.getTitikAKhir().getAbsis() + "))");

        // isTegakLurus
        if(garis1.isTegakLurus(garis2)){
            System.out.println("Garis1 tegak lurus dengan Garis2");
        } else {
            System.out.println("Garis1 tidak tegak lurus dengan Garis2");
        }
    }
}