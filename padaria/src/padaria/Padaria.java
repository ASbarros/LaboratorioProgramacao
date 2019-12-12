package padaria;

import controle.produtoCntrl;
import java.util.ArrayList;
import modelo.Produto;

public class Padaria {

    public static void main(String[] args) {
        String dados[] = new String[4];

        dados[0] = "0";
        dados[1] = "queijo";
        dados[2] = "5.0";
        dados[3] = "und";

        produtoCntrl controle = new produtoCntrl();
        //controle.salvar(dados);

        //dados = controle.recuperar(2);
        dados[2] = "0.5";
        //controle.salvar(dados);

        //controle.excluir(3);
        String[][] produtos = controle.recuperarTodos();

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i][0] + ": " + produtos[i][1] + " " + produtos[i][2] + " " + produtos[i][3]);
        }
        System.out.println("Fim!");
    }

}
