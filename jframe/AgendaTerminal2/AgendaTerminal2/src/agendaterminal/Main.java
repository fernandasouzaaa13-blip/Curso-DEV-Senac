/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaterminal;

import conexao.ConexaoSQLITE;
import dao.ContatosDAO;
import modelo.Contatos;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoSQLITE.conectar();
        ContatosDAO daocontato = new ContatosDAO();

        // daocontato.inserirContato();
       // daocontato.listarTodosContatos();
        //daocontato.inserirContato(new Contatos ("Paula","3599097341","Paula13@gmail.com "));
        daocontato.deletarContato(2);
        //daocontato.inserirContato();
     //daocontato.atualizarContato(new Contatos (3,"Julia","35999407344","julia13@gmail.com "));
       daocontato.listarTodosContatos();
    }

}
