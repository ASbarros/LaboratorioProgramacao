package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produto;

public class ProdutoDAO {

    public boolean inserir(Produto prod) {

        String sql = "insert into produto(nome, preco, unidade) values (?, ?, ?)";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, prod.getNome());
            pst.setDouble(2, prod.getPreco());
            pst.setString(3, prod.getUnidade());

            if (prod.getNome().equals("") || prod.getPreco() == 0) {
                return false;
            }

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public Produto recuperar(int id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idproduto, nome, preco, unidade from produto where idproduto = ?";

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, id);
            ResultSet resultado = stp.executeQuery();

            Produto prod = new Produto();

            if (resultado.next()) {
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
            }
            return prod;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean atualizar(Produto prod) {
        String sql = "update produto set nome = ?, preco = ?, unidade = ? where idproduto = ?";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, prod.getNome());
            pst.setDouble(2, prod.getPreco());
            pst.setString(3, prod.getUnidade());
            pst.setInt(4, prod.getCodigo());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public boolean excluir(int id) {
        try {
            Produto prod = new Produto();
            prod = this.recuperar(id);

            String sql = "delete from produto where idproduto = ?";
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public ArrayList<Produto> recuperarTodos() {
        return this.recuperarTodos("");
    }

    public ArrayList<Produto> recuperarTodos(String where) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idproduto, nome, preco, unidade from produto " + where;
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            while (resultado.next()) {
                Produto prod = new Produto();
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
                produtos.add(prod);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Produto recuperarUltimo() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idproduto) as idproduto, nome, preco, unidade from produto";

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();

            Produto prod = new Produto();

            if (resultado.next()) {
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
            }
            return prod;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Produto recuperarPrimeiro() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idproduto) as idproduto, nome, preco, unidade from produto";

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();

            Produto prod = new Produto();

            if (resultado.next()) {
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
            }
            return prod;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Produto recuperarAnterior(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idproduto) as idproduto, nome, preco, unidade from produto where idproduto < ?";

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();

            Produto prod = new Produto();

            if (resultado.next()) {
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
            }
            return prod;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Produto recuperarProximo(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idproduto) as idproduto, nome, preco, unidade from produto where idproduto > ?";

        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();

            Produto prod = new Produto();

            if (resultado.next()) {
                prod.setCodigo(Integer.parseInt(resultado.getString("idProduto")));
                prod.setNome(resultado.getString("nome"));
                prod.setPreco(resultado.getDouble("preco"));
                prod.setUnidade(resultado.getString("unidade"));
            }
            return prod;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
