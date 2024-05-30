import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args){
        // Membuat HashMap dengan key NIM dan value nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2012345678", "Rizky");
        mahasiswaMap.put("2012345679", "Ojan");
        mahasiswaMap.put("2012345680", "Ucup");
        mahasiswaMap.put("2012345681", "John Doe");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
