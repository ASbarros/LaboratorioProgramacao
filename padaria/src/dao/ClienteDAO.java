package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.cliente;

public class ClienteDAO {

    public boolean inserir(cliente cli) {

        String sql = "insert into cliente(nome, sobrenome, cpf, idade, telefone) values (?, ?, ?, ?, ?)";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getSobreNome());
            pst.setString(3, cli.getCpf());
            pst.setInt(4, cli.getIdade());
            pst.setString(5, cli.getTelefone());

            if (cli.getNome().equals("")) {
                return false;
            }

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public cliente recuperar(int id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idcliente, nome, sobrenome, cpf, idade, telefone from cliente where idcliente = ?";
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, id);
            ResultSet resultado = stp.executeQuery();

            cliente cli = new cliente();

            if (resultado.next()) {
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
            }
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean atualizar(cliente cli) {
        String sql = "update cliente set cpf = ?, nome = ?, sobrenome = ?, idade = ?, telefone = ? where idcliente = ?";
        try {
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, cli.getCpf());
            pst.setString(2, cli.getNome());
            pst.setString(3, cli.getSobreNome());
            pst.setInt(4, cli.getIdade());
            pst.setString(5, cli.getTelefone());
            pst.setInt(6, cli.getId());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o objeto: " + ex.getMessage());
            return false;
        }
    }

    public boolean excluir(int id) {
        try {
            cliente cli = new cliente();
            cli = this.recuperar(id);

            String sql = "delete from cliente where idcliente = ?";
            Connection conexao = DAO.FabricaConexao.GeraConexao();
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public ArrayList<cliente> recuperarTodos() {
        return this.recuperarTodos("");
    }

    public ArrayList<cliente> recuperarTodos(String where) {
        ArrayList<cliente> produtos = new ArrayList<>();

        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select idcliente, cpf, nome, sobrenome, idade, telefone from cliente " + where;
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            while (resultado.next()) {
                cliente cli = new cliente();
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
                produtos.add(cli);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public cliente recuperarUltimo() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idcliente) as idcliente, cpf, nome, sobrenome, idade, telefone from cliente";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            
            cliente cli = new cliente();
            
            if (resultado.next()) {
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
            }
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public cliente recuperarPrimeiro() {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idcliente) as idcliente, cpf, nome, sobrenome, idade, telefone from cliente";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            ResultSet resultado = stp.executeQuery();
            
            cliente cli = new cliente();
            
            if (resultado.next()) {
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
            }
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public cliente recuperarAnterior(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select max(idcliente) as idcliente, cpf, nome, sobrenome, idade, telefone from cliente where idcliente < ?";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();
            
            cliente cli = new cliente();
            
            if (resultado.next()) {
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
            }
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public cliente recuperarProximo(String id) {
        Connection conexao = DAO.FabricaConexao.GeraConexao();
        String sql = "select min(idcliente) as idcliente, cpf, nome, sobrenome, idade, telefone from cliente where idcliente > ?";
        
        try {
            PreparedStatement stp = conexao.prepareStatement(sql);
            stp.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stp.executeQuery();
            
            cliente cli = new cliente();
            
            if (resultado.next()) {
                cli.setId(Integer.parseInt(resultado.getString("idcliente")));
                cli.setCpf(resultado.getString("cpf"));
                cli.setNome(resultado.getString("nome"));
                cli.setSobreNome(resultado.getString("sobrenome"));
                cli.setIdade(resultado.getInt("idade"));
                cli.setTelefone(resultado.getString("telefone"));
            }
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
