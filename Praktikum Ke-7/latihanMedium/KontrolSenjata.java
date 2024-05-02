package latihanMedium;

public class KontrolSenjata{
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        this.senjata.setPeluru(this.senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(this.isAdaPeluru()){
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()){ // 3 >= 0, 2 >= 1, 1 >= 2
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                }else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }else{
            System.out.println("Peluru habis");
        }
    }

    public String menusuk(){
        if (this.senjata.isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet(){
        this.senjata.setMenusuk(true);
        System.out.println(("Bayonet Terapasang"));
    }
}