/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaterminal;

import conexao.ConexaoSQLITE;
import dao.ContatosDAO;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexaoSQLITE.conectar();
        ContatosDAO daocontato = new ContatosDAO();

        // daocontato.inserirContato();
        daocontato.listarTodosContatos();
        //daocontato.inserirContato();
        //daocontato.deletarContato();
        //daocontato.inserirContato();
        daocontato.atualizarContato();
        daocontato.listarTodosContatos();

        //daoreserva.listarTodasReservas();
        // daoreserva.deletarReserva();
        //daoreserva.atualizarReserva();
        //daoreserva.listarTodasReservas();
    }

}
