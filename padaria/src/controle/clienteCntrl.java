package controle;
import dao.ClienteDAO;
import java.util.ArrayList;
import modelo.cliente;

public class clienteCntrl {
    public boolean salvar(String[] dados, boolean a) {
        cliente P = new cliente();
        P.vetorTo(dados);

        ClienteDAO DAO = new ClienteDAO();
        if (a) {
            return DAO.inserir(P);
        } else {
            return DAO.atualizar(P);
        }
    }

    public String[] recuperar(int id) {

        ClienteDAO DAO = new ClienteDAO();
        
        cliente C = DAO.recuperar(id);

        return C.toVetor();
    }

    public String[][] recuperarTodos() {
        ClienteDAO DAO = new ClienteDAO();
        ArrayList<cliente> listaClientes = DAO.recuperarTodos();

        String[][] matrizRetorno = new String[listaClientes.size()][4];
        for (int i = 0; i < listaClientes.size(); i++) {
            matrizRetorno[i] = listaClientes.get(i).toVetor();
        }
        return matrizRetorno;
    }
    
        public String[][] recuperarTodos(String where) {
        ClienteDAO DAO = new ClienteDAO();
        ArrayList<cliente> listaClientes = DAO.recuperarTodos(where);

        String[][] matrizRetorno = new String[listaClientes.size()][4];
        for (int i = 0; i < listaClientes.size(); i++) {
            matrizRetorno[i] = listaClientes.get(i).toVetor();
        }
        return matrizRetorno;
    }

    public boolean excluir(int id) {
        try {
            ClienteDAO DAO = new ClienteDAO();
            return DAO.excluir(id);
        } catch (Exception e) {
            return false;
        }
    }
    
    public String[] recuperarUltimo() {

        ClienteDAO DAO = new ClienteDAO();

        cliente P = DAO.recuperarUltimo();

        return P.toVetor();
    }
    
    public String[] recuperarPrimeiro() {

        ClienteDAO DAO = new ClienteDAO();

        cliente P = DAO.recuperarPrimeiro();

        return P.toVetor();
    }
    
    public String[] recuperarAnterior(String id) {

        ClienteDAO DAO = new ClienteDAO();

        cliente P = DAO.recuperarAnterior(id);

        return P.toVetor();
    }
    
    public String[] recuperarProximo(String id) {

        ClienteDAO DAO = new ClienteDAO();

        cliente P = DAO.recuperarProximo(id);

        return P.toVetor();
    }
}
