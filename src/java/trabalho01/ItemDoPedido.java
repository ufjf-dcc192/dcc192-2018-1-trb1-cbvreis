package trabalho01;

public class ItemDoPedido {
    
    private String nome;
    private int quantidade;
    private double preco;
   
    public ItemDoPedido(String nome, int quantidade,double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco=preco *quantidade;
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
        return "Pedido: " + nome + "\nQuantidade: " + quantidade +  "\nPreco: " + preco ;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
         
}
