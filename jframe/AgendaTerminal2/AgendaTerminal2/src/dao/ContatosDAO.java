/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoSQLITE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import modelo.Contatos;

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

    public void inserirContato(Contatos contato) {

        String sql = "INSERT INTO contatos "
                + "(nome, telefone, email) "
                + "VALUES (?, ?,?)";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, contato.getNome());
            comando.setString(2, contato.getTelefone());
            comando.setString(3, contato.getEmail());

            comando.executeUpdate();

            System.out.println("Contato inserido!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
    // Deletar Produto

    public void deletarContato(int id) {

        String sql = "DELETE FROM contatos WHERE id = ?";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();

            System.out.println("Contato excluído!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void atualizarContato(Contatos contato) {

        String sql = "UPDATE contatos "
                + "SET nome = ?,telefone =? ,email = ? "
                + "WHERE id =?";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, contato.getNome());
            comando.setString(2, contato.getTelefone());
            comando.setString(3, contato.getEmail());
            comando.setInt(4, contato.getId());
            comando.executeUpdate();

            System.out.println("Contato atualizado!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

}
