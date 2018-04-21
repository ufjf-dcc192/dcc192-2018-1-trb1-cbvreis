
package trabalho01;

import java.util.Date;


public class Mesas {
    
    private int mesacod;
    Pedidos pedido;

    public Pedidos getPedido() {
        return pedido;
    }

    public Mesas(int mesacod, Pedidos pedido) {
        this.mesacod = mesacod;
        this.pedido = pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
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
