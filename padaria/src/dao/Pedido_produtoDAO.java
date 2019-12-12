package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pedido_produto;

public class Pedido_produtoDAO {

    public boolean inserir(Pedido_produto ped) {

        String sql = "insert into pedido_produto(idPedido, idproduto, qtde, preco, precoTotal) values (?, ?, ?, ?, ?)";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, ped.getIdPedido());
            System.out.println(ped.getIdPedido());
            pst.setInt(2, ped.getIdProduto());
            pst.setInt(3, ped.getQtde());
            pst.setFloat(4, ped.getPreco());
            pst.setFloat(5, ped.getPrecoTotal());

            if (ped.getIdPedido() == 0 && ped.getIdProduto()== 0) {
                return false;
            }

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("--Erro ao salvar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public Pedido_produto recuperar(int idPedido, int idProduto) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idpedido, idproduto, dtde, preco, precoTotal from pedido_produto where idPedido = ? and idproduto = ?";
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, idPedido);
            stp.setInt(2, idProduto);
            ResultSet resultado = stp.executeQuery();

            Pedido_produto ped = new Pedido_produto();
            if (resultado.next()) {
                ped.setIdPedido(Integer.parseInt(resultado.getString("idPedido")));
                ped.setIdProduto(Integer.parseInt(resultado.getString("idProduto")));
                ped.setQtde(resultado.getInt("qtde"));
                ped.setPreco(resultado.getFloat("preco"));
                ped.setPrecoTotal(resultado.getFloat("precoTotal"));
            }
            return ped;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean atualizar(Pedido_produto ped) {
        String sql = "update pedido_produto set qtde = ?, preco = ?, precoTotal = ? where idPedido = ? and idProduto = ?";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, ped.getQtde());
            pst.setFloat(2, ped.getPreco());
            pst.setFloat(3, ped.getPrecoTotal());
            pst.setInt(4, ped.getIdPedido());
            pst.setInt(5, ped.getIdProduto());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public boolean excluir(int idPedido, int idProduto) {
        try {
            Pedido_produto ped = new Pedido_produto();
            ped = this.recuperar(idPedido, idProduto);

            String sql = "delete from pedido_produto where idPedido = ? and idProduto = ?";
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, idPedido);
            pst.setInt(2, idProduto);

            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Pedido_produto> recuperarTodos() {
        return this.recuperarTodos("");
    }

    public ArrayList<Pedido_produto> recuperarTodos(String where) {
        ArrayList<Pedido_produto> produtos_pedidos = new ArrayList<>();

        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idPedido, idProduto, preco, precoTotal, qtde from pedido_produto " + where;
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            while (resultado.next()) {
                Pedido_produto ped = new Pedido_produto();
                ped.setIdPedido(Integer.parseInt(resultado.getString("idPedido")));
                ped.setIdProduto(Integer.parseInt(resultado.getString("idProduto")));
                ped.setPreco(Float.parseFloat(resultado.getString("preco")));
                ped.setPrecoTotal(Float.parseFloat(resultado.getString("precoTotal")));
                ped.setQtde(Integer.parseInt(resultado.getString("qtde")));
                produtos_pedidos.add(ped);
            }
            return produtos_pedidos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
