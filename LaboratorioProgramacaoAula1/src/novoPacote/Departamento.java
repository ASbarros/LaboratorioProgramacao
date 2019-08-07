/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoPacote;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Departamento {

    public Departamento() {
        meusFuncionarios = new ArrayList<>();
    }

    private Departamento dep;
    private int id;
    private String descricao;
    private double valorHora;
    private ArrayList<funcionario> meusFuncionarios;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int length() {
        return descricao.length();
    }

    public char charAt(int index) {
        return descricao.charAt(index);
    }

    public int codePointAt(int index) {
        return descricao.codePointAt(index);
    }

    public boolean equals(Object anObject) {
        return descricao.equals(anObject);
    }

    public int indexOf(String str) {
        return descricao.indexOf(str);
    }

    public void addFuncionario(funcionario e) {
        meusFuncionarios.add(e);
        e.setDepartamento(this);
    }

    public void inprimirFuncionario() {
        System.out.println("funcionarios do meu departamento: ");
        for (funcionario Funcionario : meusFuncionarios) {
            System.out.println(Funcionario);
        }
    }
}
