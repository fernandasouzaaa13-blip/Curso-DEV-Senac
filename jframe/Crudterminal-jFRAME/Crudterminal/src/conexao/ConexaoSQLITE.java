/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoSQLITE {

    public static Connection conectar() {

        try {
            String url = "jdbc:sqlite:banco/MeuBanco.db";
            Connection conexao = DriverManager.getConnection(url);

            System.out.println("Banco conectado!");

            return conexao;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

}
