package modelo;

public class Pedido_produto {
    private int idPedido;
    private int idProduto;
    private int qtde;
    private float precoTotal;
    private float preco;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String[] toVetor() {
        String vetor[] = new String[6];
        vetor[1] = String.valueOf(getIdPedido());
        vetor[2] = String.valueOf(getIdProduto());
        vetor[3] = String.valueOf(getQtde());
        vetor[4] = String.valueOf(getPreco());
        vetor[5] = String.valueOf(getPrecoTotal());

        return vetor;
    }

      public void vetorTo(String[] dados) {
        this.setIdPedido(Integer.parseInt(dados[1]));
        this.setIdProduto(Integer.parseInt(dados[2]));
        this.setQtde(Integer.parseInt(dados[3]));
        this.setPreco(Float.parseFloat(dados[4]));
        this.setPrecoTotal(Float.parseFloat(dados[5]));
    }
    
}
