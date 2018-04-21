
package trabalho01;


public class ItemDoPedido {
    
    private String nome;
    private int quantidade;
    private int preco;


    public ItemDoPedido(String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pedido: " + nome + "\nQuantidade: " + quantidade + "\npreco: " + preco + "\nValor: " + quantidade*preco ;
    }
    
    
           
}
