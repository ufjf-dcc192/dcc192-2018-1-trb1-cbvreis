
package trabalho01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedidos {
    
    private int pedidoCod;
    private Date dataPedidoAbertura;
    private Date dataPedidoFechamento;
    private boolean estado = true; //aberto
    private List<ItemDoPedido> pedidos = new ArrayList<>();

  
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

    public Date getDataPedidoAbertura() {
        return dataPedidoAbertura;
    }

    public void setDataPedidoAbertura(Date dataPedidoAbertura) {
        this.dataPedidoAbertura = dataPedidoAbertura;
    }

    public Date getDataPedidoFechamento() {
        return dataPedidoFechamento;
    }

    public void setDataPedidoFechamento(Date dataPedidoFechamento) {
        this.dataPedidoFechamento = dataPedidoFechamento;
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

     

}
