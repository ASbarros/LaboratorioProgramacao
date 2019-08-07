/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprogramacaoaula1;

import novoPacote.Departamento;
import novoPacote.funcionario;

/**
 *
 * @author Aluno
 */
public class LaboratorioProgramacaoAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Departamento objDep1 = new Departamento();
        objDep1.setId(1);
        objDep1.setDescricao("Finanças");
        objDep1.setValorHora(50);

        funcionario objFunc1 = new funcionario(
                "123.456.789-98",
                10,
                true,
                null,
                objDep1
        );
        objDep1.addFuncionario(objFunc1);
        objDep1.inprimirFuncionario();
    }

}
