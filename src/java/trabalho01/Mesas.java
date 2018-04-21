
package trabalho01;

import java.util.Date;


public class Mesas {
    
    private int mesacod;
    private Date date;

    @Override
    public String toString() {
        return "Mesa número : " + mesacod;
    }

    public Mesas() {
    }

    public Mesas(int mesacod) {
        this.mesacod = mesacod;
    }

    public int getMesacod() {
        return mesacod;
    }

    public void setMesacod(int mesacod) {
        this.mesacod = mesacod;
    }
    
    
    
}
