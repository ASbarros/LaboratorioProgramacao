/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import modelo.vendedor;
import dao.VendedorDAO;
import java.util.ArrayList;
/**
 *
 * @author Anderson
 */
public class vendedorCntrl {
    public boolean salvar(String[] dados) {
        vendedor P = new vendedor();
        P.vetorTo(dados);

        VendedorDAO DAO = new VendedorDAO();
        if (P.getId()== 0) {
            return DAO.inserir(P);
        } else {
            return DAO.atualizar(P);
        }
    }

    public String[] recuperar(int id) {

        VendedorDAO DAO = new VendedorDAO();
        
        vendedor C = DAO.recuperar(id);

        return C.toVetor();
    }

    public String[][] recuperarTodos() {
        VendedorDAO DAO = new VendedorDAO();
        ArrayList<vendedor> listaVendedotes = DAO.recuperarTodos();

        String[][] matrizRetorno = new String[listaVendedotes.size()][6];
        for (int i = 0; i < listaVendedotes.size(); i++) {
            matrizRetorno[i] = listaVendedotes.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public boolean excluir(int id) {
        try {
            VendedorDAO DAO = new VendedorDAO();
            return DAO.excluir(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public String[] recuperarUltimo() {

        VendedorDAO DAO = new VendedorDAO();

        vendedor P = DAO.recuperarUltimo();

        return P.toVetor();
    }
    
    public String[] recuperarPrimeiro() {

        VendedorDAO DAO = new VendedorDAO();

        vendedor P = DAO.recuperarPrimeiro();

        return P.toVetor();
    }
    
    public String[] recuperarAnterior(String id) {

        VendedorDAO DAO = new VendedorDAO();

        vendedor P = DAO.recuperarAnterior(id);

        return P.toVetor();
    }
    
    public String[] recuperarProximo(String id) {

        VendedorDAO DAO = new VendedorDAO();

        vendedor P = DAO.recuperarProximo(id);

        return P.toVetor();
    }
}
