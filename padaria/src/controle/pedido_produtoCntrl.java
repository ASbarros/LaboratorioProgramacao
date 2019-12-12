package controle;

import dao.Pedido_produtoDAO;
import java.util.ArrayList;
import modelo.Pedido_produto;


public class pedido_produtoCntrl {
     public boolean salvar(String[] dados) {
        Pedido_produto P = new Pedido_produto();
        P.vetorTo(dados);

        Pedido_produtoDAO DAO = new Pedido_produtoDAO();
        if (dados[0].equals("I")) {
            return DAO.inserir(P);
        } else {
            return DAO.atualizar(P);
        }
    }

    public String[] recuperar(int idPedido, int idProduto) {

        Pedido_produtoDAO DAO = new Pedido_produtoDAO();

        Pedido_produto P = DAO.recuperar(idPedido, idProduto);

        return P.toVetor();
    }

    public String[][] recuperarTodos() {
        Pedido_produtoDAO DAO = new Pedido_produtoDAO();
        ArrayList<Pedido_produto> listaProdutos = DAO.recuperarTodos();

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public String[][] recuperarTodos(String where) {
        Pedido_produtoDAO DAO = new Pedido_produtoDAO();
        ArrayList<Pedido_produto> listaProdutos = DAO.recuperarTodos(where);

        String[][] matrizRetorno = new String[listaProdutos.size()][4];
        for (int i = 0; i < listaProdutos.size(); i++) {
            matrizRetorno[i] = listaProdutos.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public boolean excluir(int idPedido, int idProduto) {
        try {
            Pedido_produtoDAO DAO = new Pedido_produtoDAO();
            return DAO.excluir(idPedido, idProduto);
        } catch (Exception e) {
            return false;
        }
    }
}
