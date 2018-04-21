
package trabalho01;

import java.util.Date;


public class Mesas {
    
    private static int contadorDeMesa = 0;
    private int mesacod = 0;
    private boolean flagMesa = false;
    Pedidos pedido;

    public static int getContadorDeMesa() {
        return contadorDeMesa;
    }

    public static void setContadorDeMesa(int contadorDeMesa) {
        Mesas.contadorDeMesa = contadorDeMesa;
    }

    public boolean isFlagMesa() {
        return flagMesa;
    }

    public void setFlagMesa(boolean flagMesa) {
        this.flagMesa = flagMesa;
    }
    
    
    public Pedidos getPedido() {
        return pedido;
    }

    public Mesas(int mesacod, Pedidos pedido) {
        this.contadorDeMesa = mesacod;
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
        return "Mesa " + mesacod;
    }

    public Mesas() {
        mesacod  = contadorDeMesa;
        this.contadorDeMesa++;
    }

    public Mesas(int mesacod) {
        this.contadorDeMesa = mesacod;
    }

    public int getMesacod() {
        return mesacod;
    }

    public void setMesacod(int mesacod) {
        this.contadorDeMesa = mesacod;
    }
    
    
    
    
}
