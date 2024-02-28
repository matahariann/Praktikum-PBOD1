public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAKhir(){
        return this.titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow((titikAkhir.getAbsis()) - titikAwal.getAbsis(),2) + Math.pow((titikAkhir.getOrdinat()) - titikAwal.getOrdinat(),2));
    }

    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public void gettRefleksiY(){
        titikAwal.getRefleksiY();
        titikAkhir.getRefleksiY();
    }

    public boolean isTegakLurus(Garis G){
        return G.getGradien() * this.getGradien()  == -1;
    }
}

