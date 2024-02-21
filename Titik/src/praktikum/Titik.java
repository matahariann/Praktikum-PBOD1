package praktikum;

class Titik{
    double absis;
    double ordinat;
    static int counter;

    Titik(){
        counter++;
        this.absis = 0;
        this.ordinat = 0;

    }
    Titik(double absis, double ordinat){
        counter++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    void setAbsis(double absis){
        this.absis = absis;
    }

    void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    double getAbsis(){
        return this.absis;
    }

    double getOrdinat(){
        return this.ordinat;
    }

    int getCounter(){
        return counter;
    }
}