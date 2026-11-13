/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection; //Representa a conexão com o banco de dados.
import java.sql.DriverManager;//Gerencia e obtém conexões com o banco.

public class ConexaoLanchonete {

    public static Connection conectar() {
        try {
            String url = "jdbc:sqlite:banco/bancoLanchonete.db";//o caminho do banco de dados SQLite
            Connection conexao = DriverManager.getConnection(url);//Solicita uma conexão com o banco de dados

            System.out.println("Banco conectado!");// Exibe uma mensagem no console confirmando a conexão

            return conexao; // // Retorna a conexão para quem chamou o método
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());//  // Exibe a mensagem do erro ocorrido
            return null;//Retorna null caso a conexão falhe
        }

    }
}
