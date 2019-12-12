/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.UUID;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Funcionario {

    private UUID uuid = UUID.randomUUID();

    private String nome;
    private String cpf;
    private String telefone;
    private String celular;
    private String fax;
    private String codigo;
    private boolean favorito;

    public Funcionario(String nome, String cpf, String telefone, String celular, String fax, boolean favorito) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.fax = fax;
        this.codigo = uuid.toString();
        this.favorito = favorito;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getFax() {
        return fax;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telecone) {
        this.telefone = telecone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

}
