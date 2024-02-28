class Titik{
    private double absis;
    private double ordinat;

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik(){
        this(0,0);
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public double getJarakPusat(){
        return Math.sqrt(getAbsis() * getAbsis() + getOrdinat() * getOrdinat());
    }

    public void relfeksiX(){
        setOrdinat(getOrdinat() * -1);
    }

    public void relfeksiY(){
        setAbsis(getAbsis() * -1);
    }

    public void getRefleksiX(){
        relfeksiX();
    }   

    public void getRefleksiY(){
        relfeksiY();
    }
}