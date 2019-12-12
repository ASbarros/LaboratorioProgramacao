package controle;

import dao.PedidoDAO;
import java.util.ArrayList;
import modelo.Pedido;

public class pedidoCntrl {

    public boolean salvar(String[] dados) {
        Pedido P = new Pedido();
        P.vetorTo(dados);

        PedidoDAO DAO = new PedidoDAO();
        if (dados[0].equals("I")) {
            return DAO.inserir(P);
        } else {
            return DAO.atualizar(P);
        }
    }
    
    public int recuperaUltimo() {
        PedidoDAO DAO = new PedidoDAO();
        return DAO.recuperaUltimo();
    }

    public String[] recuperar(int idCliente, int idProduto, int idVendedor) {

        PedidoDAO DAO = new PedidoDAO();

        Pedido P = DAO.recuperar(idCliente, idProduto, idVendedor);

        return P.toVetor();
    }

    public String[][] recuperarTodos() {
        PedidoDAO DAO = new PedidoDAO();
        ArrayList<Pedido> listaProdutos = DAO.recuperarTodos();

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public String[][] recuperarTodos(String where) {
        PedidoDAO DAO = new PedidoDAO();
        ArrayList<Pedido> listaProdutos = DAO.recuperarTodos(where);

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public boolean excluir(int idCliente, int idProduto, int idVendedor) {
        try {
            PedidoDAO DAO = new PedidoDAO();
            return DAO.excluir(idCliente, idProduto, idVendedor);
        } catch (Exception e) {
            return false;
        }
    }
}
