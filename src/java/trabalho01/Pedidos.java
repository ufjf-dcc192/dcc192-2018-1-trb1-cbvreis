
package trabalho01;

import java.util.Date;
import java.util.List;


public class Pedidos {
    
    private int pedidoCod;
    private Date dataPedidoAbertura;
    private Date dataPedidoFechamento;
    private boolean estado = true;
    private ItemDoPedido pedidos;

    public Pedidos(ItemDoPedido pedidos) {
        this.pedidos = pedidos;
    }

    public Pedidos() {
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

    public ItemDoPedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(ItemDoPedido pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Item Pedido=" + pedidos.getNome()  + pedidos.getQuantidade(); 
    }

    

}
