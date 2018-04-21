
package trabalho01;

import java.util.Date;
import java.util.List;


public class Pedidos {
    
    private int pedidoCod;
    private Date dataPedidoAbertura;
    private Date dataPedidoFechamento;
    private boolean estado = true;
    private List<ItemDoPedido> pedidos;

    public Pedidos(int pedidoCod, boolean flagAberto, List<ItemDoPedido> pedidos) {
        this.pedidoCod = pedidoCod;
        this.estado = flagAberto;
        this.pedidos = pedidos;
    }

    public List<ItemDoPedido> getPedidos() {
        return pedidos;
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

}
