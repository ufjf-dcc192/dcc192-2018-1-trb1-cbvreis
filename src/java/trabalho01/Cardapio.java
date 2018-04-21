
package trabalho01;

public class Cardapio {
    
    private String produto;
    private int preco;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Cardapio(String produto, int preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public Cardapio() {
    }
    
    
}
