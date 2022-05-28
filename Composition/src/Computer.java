

/**
 *
 * @author Mehmet
 */
public class Computer {
    private Monitor monitor;
    private Anakart anakart;
    private Kasa kasa;

    public Computer(Monitor monitor, Anakart anakart, Kasa kasa) {
        this.monitor = monitor;
        this.anakart = anakart;
        this.kasa = kasa;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    
    
}
