/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoSQLITE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ContatosDAO {
    
        public void listarTodosContatos() {

        String sql = "SELECT * FROM contatos";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            ResultSet resultado = comando.executeQuery(sql);

            while (resultado.next()) {

                System.out.println(
                        resultado.getInt("id") + " - "
                        + resultado.getString("nome") + " - "
                        + resultado.getString("telefone") + " - "
                        + resultado.getString("email") + " - "
                     
                );

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void inserirContato() {

        String sql = "INSERT INTO contatos "
                + "(nome, telefone, email) "
                + "VALUES ('Lucas', '(35) 99123-4568',' Lucas Ereiraa.santos@email.com')";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Contato inserido!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
    // Deletar Produto

    public void deletarContato() {

        String sql = "DELETE FROM contatos WHERE id = 1";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Contato excluído!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
     public void atualizarContato() {

        String sql = "UPDATE contatos " 
                + "SET nome = 'Lucas Silva',telefone ='35999497342' ,email = 'luquinhasilva@gmail.com' " 
                + "WHERE id =2 ";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Contato atualizado!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
    
}

    
    
