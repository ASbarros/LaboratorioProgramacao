/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoPacote;

import java.util.Calendar;

/**
 *
 * @author Aluno
 */
public class funcionario extends Pessoa {

    private String cpf;
    private double qtdeHoras;
    private boolean ativo;
    private Calendar admissao;
    private Departamento departamento;

    public funcionario(Departamento d) {
        this.departamento = d;
    }

    public funcionario(String cpf, double qtdeHoras, boolean ativo, Calendar admissao, Departamento departamento) {
        this.cpf = cpf;
        this.qtdeHoras = qtdeHoras;
        this.ativo = ativo;
        this.admissao = admissao;
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Calendar getAdmissao() {
        return admissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setQtdeHoras(double qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setAdmissao(Calendar admissao) {
        this.admissao = admissao;
    }

    public double calcSalario() {
        return qtdeHoras * departamento.getValorHora();
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return getCodigo() + ": " + getNome() + " - " + calcSalario();
    }
}
