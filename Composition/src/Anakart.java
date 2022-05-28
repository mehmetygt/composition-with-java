



/**
 *
 * @author Mehmet
 */
public class Anakart {
    private String model;
    private String üretici;
    private int yuva_sayısı;
    private String isletim_sistemi;

    public Anakart(String model, String üretici, int yuva_sayısı, String isletim_sistemi) {
        this.model = model;
        this.üretici = üretici;
        this.yuva_sayısı = yuva_sayısı;
        this.isletim_sistemi = isletim_sistemi;
    }
    public  void  isletim_sistemi_yukle(String isletim_sistemi){
        this.isletim_sistemi=isletim_sistemi;
        System.out.println("yeni isletim sistemi yüklendi : "+isletim_sistemi);
    
    
    }
    public String getModel() {
        return model;
    }

    public String getÜretici() {
        return üretici;
    }

    public int getYuva_sayısı() {
        return yuva_sayısı;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public void setYuva_sayısı(int yuva_sayısı) {
        this.yuva_sayısı = yuva_sayısı;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    
    
    
}
