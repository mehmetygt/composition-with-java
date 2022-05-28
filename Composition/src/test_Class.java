
/**
 *
 * @author Mehmet
 */
public class test_Class {
    public static void main(String[] args) {
        
    Resolution resolution=new Resolution(1920,1080);
    Monitor monitor=new  Monitor("VS197DE","ASUS","18,5", resolution);
    Kasa kasa=new Kasa("SHADOW BLADE","SHADOW","TEMPERLİ CAM");
    Anakart anakart=new Anakart("B250-PRO","ASUS", 10,"WİNDOWS 10");
    Computer computer=new Computer(monitor, anakart, kasa);
    
    computer.getKasa().bigisayar_ac();
    computer.getMonitor().monitor_kapat();
    computer.getAnakart().isletim_sistemi_yukle("WİNDOWS 10");
        System.out.println(computer.getMonitor().getResoution().getEn());
    

        
    }
    
        
}
