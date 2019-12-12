/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Anderson
 */
public class pessoa {

    private String nome;
    private String sobreNome;
    private String cpf;
    private int idade;
    private String telefone;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public pessoa() {
        
    }

    public pessoa(String nome, String sobreNome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String[] toVetor() {
        String vetor[] = new String[6];
        vetor[0] = String.valueOf(getId());
        vetor[1] = getCpf();
        vetor[2] = String.valueOf(getNome());
        vetor[3] = getSobreNome();
        vetor[4] = String.valueOf(getIdade());
        vetor[5] = getTelefone();

        return vetor;
    }

    public void vetorTo(String[] dados) {
        this.setId(Integer.parseInt(dados[0]));
        this.setCpf(dados[1]);
        this.setNome(dados[2]);
        this.setSobreNome(dados[3]);
        this.setIdade(Integer.parseInt(dados[4]));
        this.setTelefone(dados[5]);
    }

}
