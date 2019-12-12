package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.vendedor;

public class VendedorDAO {
    public boolean inserir(vendedor vend) {

        String sql = "insert into vendedor (nome, sobrenome, cpf, idade, telefone) values (?, ?, ?, ?, ?)";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, vend.getNome());
            pst.setString(2, vend.getSobreNome());
            pst.setString(3, vend.getCpf());
            pst.setInt(4, vend.getIdade());
            pst.setString(5, vend.getTelefone());

            if (vend.getNome().equals("")) {
                return false;
            }

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public vendedor recuperar(int id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idvendedor, nome, sobrenome, cpf, idade, telefone from vendedor where idvendedor = ?";
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, id);
            ResultSet resultado = stp.executeQuery();

            vendedor vend = new vendedor();

            if (resultado.next()) {
                vend.setId(Integer.parseInt(resultado.getString("idvendedor")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
            }
            return vend;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean atualizar(vendedor vend) {
        String sql = "update vendedor set cpf = ?, nome = ?, sobrenome = ?, idade = ?, telefone = ? where idvendedor = ?";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, vend.getCpf());
            pst.setString(2, vend.getNome());
            pst.setString(3, vend.getSobreNome());
            pst.setInt(4, vend.getIdade());
            pst.setString(5, vend.getTelefone());
            pst.setInt(6, vend.getId());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public boolean excluir(int id) {
        try {
            vendedor vend = new vendedor();
            vend = this.recuperar(id);

            String sql = "delete from vendedor where idvendedor = ?";
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public ArrayList<vendedor> recuperarTodos() {
        return this.recuperarTodos("");
    }

    public ArrayList<vendedor> recuperarTodos(String where) {
        ArrayList<vendedor> vendedores = new ArrayList<>();

        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idvendedor, cpf, nome, sobrenome, idade, telefone from vendedor " + where;
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            while (resultado.next()) {
                vendedor vend = new vendedor();
                vend.setId(Integer.parseInt(resultado.getString("idvendedor")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
                vendedores.add(vend);
            }
            return vendedores;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public vendedor recuperarUltimo() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idvendedor) as idvendedor, cpf, nome, sobrenome, idade, telefone from vendedor";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            
            vendedor vend = new vendedor();
            
            if (resultado.next()) {
                vend.setId(Integer.parseInt(resultado.getString("idcliente")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
            }
            return vend;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public vendedor recuperarPrimeiro() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idvendedor) as idvendedor, cpf, nome, sobrenome, idade, telefone from vendedor";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            
            vendedor vend = new vendedor();
            
            if (resultado.next()) {
                vend.setId(Integer.parseInt(resultado.getString("idcliente")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
            }
            return vend;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public vendedor recuperarAnterior(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idvendedor) as idvendedor, cpf, nome, sobrenome, idade, telefone from vendedor where vendedor < ?";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();
            
            vendedor vend = new vendedor();
            
            if (resultado.next()) {
                vend.setId(Integer.parseInt(resultado.getString("idcliente")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
            }
            return vend;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public vendedor recuperarProximo(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idvendedor) as idvendedor, cpf, nome, sobrenome, idade, telefone from vendedor where idvendedor > ?";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();
            
            vendedor vend = new vendedor();
            
            if (resultado.next()) {
                vend.setId(Integer.parseInt(resultado.getString("idcliente")));
                vend.setCpf(resultado.getString("cpf"));
                vend.setNome(resultado.getString("nome"));
                vend.setSobreNome(resultado.getString("sobrenome"));
                vend.setIdade(resultado.getInt("idade"));
                vend.setTelefone(resultado.getString("telefone"));
            }
            return vend;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
