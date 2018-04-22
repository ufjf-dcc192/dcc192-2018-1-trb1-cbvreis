
package trabalho01;


public class ItemDoPedido {
    
    private String nome;
    private int quantidade;
   
    public ItemDoPedido(String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
     
    }

    public ItemDoPedido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido: " + nome + "\nQuantidade: " + quantidade  ;
    }

    public ItemDoPedido(String nome, int preco) {
        this.nome = nome;
    }
    
    
           
}
