class Kupu {
    public void gerak(){
        
    }
}

class Ulat extends Kupu{
    public void gerak(){
        System.out.println("Ulat merayap");
    }
}

class Data<T>{
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;;
    }
}

class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K;
        Data<Kupu> anu;
        
        // Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(new Ulat());
        anu.getIsi().gerak();
    }
}