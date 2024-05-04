package Office;

public class Programmer extends Pegawai{
    private int bonus;
    
    public Programmer(String nama){
        super(nama);
        this.bonus = 450000;
    }
    
    public int getBonus(){
        return this.bonus;
    }
    
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + getBonus());
    }
    
}
