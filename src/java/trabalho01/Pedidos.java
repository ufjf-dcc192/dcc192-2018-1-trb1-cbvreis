
package trabalho01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedidos {
    
    private int pedidoCod;
    private String dataPedidoAbertura;
    private String dataPedidoFechamento;
    private int flagDate = 0;
    private double somaTotal = 0;
    private boolean estado = true; //aberto
    private List<ItemDoPedido> pedidos = new ArrayList<>();
  
    
    
    

    public double getSomaTotal() {
        return somaTotal;
    }

    public void setSomaTotal(double somaTotal) {
        this.somaTotal = somaTotal + this.somaTotal ;
    }

    public int getFlagDate() {
        return flagDate;
    }

    public void setFlagDate(int flagDate) {
        this.flagDate = flagDate;
    }

  
    public Pedidos() {
     
    }

    public Pedidos(ItemDoPedido novoItem) {
        pedidos.add(novoItem);
    }

      
    public int getPedidoCod() {
        return pedidoCod;
    }

    public void setPedidoCod(int pedidoCod) {
        this.pedidoCod = pedidoCod;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Pedidos(List<ItemDoPedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<ItemDoPedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<ItemDoPedido> pedidos) {
        this.pedidos = pedidos;
    }

      public String getDataPedidoAbertura() {
        return dataPedidoAbertura;
    }

    public void setDataPedidoAbertura(String dataPedidoAbertura) {
        this.dataPedidoAbertura = dataPedidoAbertura;
    }

    public String getDataPedidoFechamento() {
        return dataPedidoFechamento;
    }

    public void setDataPedidoFechamento(String dataPedidoFechamento) {
        this.dataPedidoFechamento = dataPedidoFechamento;
    }


}
