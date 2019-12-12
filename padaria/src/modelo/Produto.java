package modelo;

import java.lang.reflect.Modifier;
import java.util.logging.Logger;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private String unidade;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public String[] toVetor() {
        String vetor[] = new String[4];
        vetor[0] = String.valueOf(getCodigo());
        vetor[1] = getNome();
        vetor[2] = String.valueOf(getPreco());
        vetor[3] = getUnidade();

        return vetor;
    }

    public void vetorTo(String[] dados) {
        this.setCodigo(Integer.parseInt(dados[0]));
        this.setNome(dados[1]);
        if (!dados[2].equals("")) {
            this.setPreco(Double.parseDouble(dados[2]));
        }
        this.setUnidade(dados[3]);
    }

}
