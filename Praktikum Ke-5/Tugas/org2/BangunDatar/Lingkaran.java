package BangunDatar;
import static java.lang.Math.PI;
import Area.IArea;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
