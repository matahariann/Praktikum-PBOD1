package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru() {
        return this.peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak(){
        if (this.peluru > 0){
            System.out.println(this.bunyi);
            this.peluru--;
            System.out.println("Sisa peluru: " + getPeluru());
        }else{
            System.out.println("Gagal tembak, Peluru Habis");
        }
    }
}
