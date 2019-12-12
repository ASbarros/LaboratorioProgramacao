package modelo;

public class Pedido {

    private int idCliente;
    private int idProduto;
    private int idVendedor;
    private String data;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String[] toVetor() {
        String vetor[] = new String[6];
        vetor[1] = String.valueOf(getIdCliente());
        vetor[2] = String.valueOf(getIdVendedor());
        vetor[3] = String.valueOf(getData());

        return vetor;
    }

    public void vetorTo(String[] dados) {
        this.setIdCliente(Integer.parseInt(dados[1]));
        this.setIdVendedor(Integer.parseInt(dados[2]));
        this.setData(dados[3]);
    }

}
