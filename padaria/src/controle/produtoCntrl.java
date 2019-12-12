/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author Aluno
 */
public class produtoCntrl {

    public boolean salvar(String[] dados) {
        Produto P = new Produto();
        P.vetorTo(dados);

        ProdutoDAO DAO = new ProdutoDAO();
        if (P.getCodigo() == 0) {
            return DAO.inserir(P);
        } else {
            return DAO.atualizar(P);
        }
    }

    public String[] recuperar(int id) {

        ProdutoDAO DAO = new ProdutoDAO();

        Produto P = DAO.recuperar(id);

        return P.toVetor();
    }

    public String[][] recuperarTodos() {
        ProdutoDAO DAO = new ProdutoDAO();
        ArrayList<Produto> listaProdutos = DAO.recuperarTodos();

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }
    public String[][] recuperarTodos(String where) {
        ProdutoDAO DAO = new ProdutoDAO();
        ArrayList<Produto> listaProdutos = DAO.recuperarTodos(where);

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public boolean excluir(int id) {
        try {
            ProdutoDAO DAO = new ProdutoDAO();
            return DAO.excluir(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public String[] recuperarUltimo() {

        ProdutoDAO DAO = new ProdutoDAO();

        Produto P = DAO.recuperarUltimo();

        return P.toVetor();
    }
    
    public String[] recuperarPrimeiro() {

        ProdutoDAO DAO = new ProdutoDAO();

        Produto P = DAO.recuperarPrimeiro();

        return P.toVetor();
    }
    
    public String[] recuperarAnterior(String id) {

        ProdutoDAO DAO = new ProdutoDAO();

        Produto P = DAO.recuperarAnterior(id);

        return P.toVetor();
    }
    
    public String[] recuperarProximo(String id) {

        ProdutoDAO DAO = new ProdutoDAO();

        Produto P = DAO.recuperarProximo(id);

        return P.toVetor();
    }
}
