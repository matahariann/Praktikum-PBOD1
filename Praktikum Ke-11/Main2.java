class Kupu{
    public void gerak(){
        
    }
}

class Ulat extends Kupu{
    public void gerak(){
        System.out.println("Ulat merayap");
    }
}

class Kepompong extends Kupu{
    public void gerak(){
        System.out.println("Kepompong diam"); 
    }
}

class KupuDewasa extends Kupu{
    public void gerak(){
        System.out.println("Kupu terbang");
    }
}

class Data<T>{
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}

class Main2{
    public static void main(String[] args) {
        // Kamus
        Ulat K;
        Data<Kupu> anu;
        
        // Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}