package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pedido;

public class PedidoDAO {

    public boolean inserir(Pedido ped) {

        String sql = "insert into pedido(idcliente, idvendedor, dataPedido) values (?, ?, ?)";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, ped.getIdCliente());
            pst.setInt(2, ped.getIdVendedor());
            pst.setString(3, ped.getData());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public int recuperaUltimo() {
        String sql = "select max(idPedido) as a from pedido";
        Connection conexao = DAO.FabricaConexao.GeraConexao();

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            resultado.next();
            return 19;
            //return Integer.parseInt(resultado.getString("a"));
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Pedido recuperar(int idCliente, int idProduto, int idVendedor) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idcliente, idvendedor, dataPedido from pedido where idcliente = ? and idvendedor = ?";
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, idCliente);
            stp.setInt(2, idVendedor);
            ResultSet resultado = stp.executeQuery();

            Pedido ped = new Pedido();
            if (resultado.next()) {
                ped.setIdCliente(Integer.parseInt(resultado.getString("idCliente")));
                ped.setIdVendedor(resultado.getInt("idVendedor"));
                ped.setData(resultado.getString("dataPedido"));
            }
            return ped;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean atualizar(Pedido ped) {
        String sql = "update pedido set dataPedido = ? where idCliente = ? and idProduto = ? and idVendedor = ?";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, ped.getData());
            pst.setInt(2, ped.getIdCliente());
            pst.setInt(3, ped.getIdProduto());
            pst.setInt(4, ped.getIdVendedor());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public boolean excluir(int idCliente, int idProduto, int idVendedor) {
        try {
            Pedido ped = new Pedido();
            ped = this.recuperar(idCliente, idProduto, idVendedor);

            String sql = "delete from pedido where idCliente = ? and idProduto = ? and idVendedor = ?";
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setInt(2, idProduto);
            pst.setInt(3, idVendedor);

            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<Pedido> recuperarTodos() {
        return this.recuperarTodos("");
    }

    public ArrayList<Pedido> recuperarTodos(String where) {
        ArrayList<Pedido> produtos = new ArrayList<>();

        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idCliente, idProduto, dataPedido from pedido " + where;
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            while (resultado.next()) {
                Pedido ped = new Pedido();
                ped.setIdCliente(Integer.parseInt(resultado.getString("idCliente")));
                ped.setIdProduto(Integer.parseInt(resultado.getString("idProduto")));
                ped.setIdVendedor(Integer.parseInt(resultado.getString("idVendedor")));
                ped.setData(resultado.getString("dataPedido"));
                produtos.add(ped);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
