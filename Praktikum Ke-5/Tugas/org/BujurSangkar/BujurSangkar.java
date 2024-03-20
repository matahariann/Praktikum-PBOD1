public class BujurSangkar extends BangunDatar{
    public double calculateLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }

    // Error, karena class BujurSangkar harus mengimplementasikan pewarisan dari method BangunDatar, yaitu hitungLuas(double sisi)
}
