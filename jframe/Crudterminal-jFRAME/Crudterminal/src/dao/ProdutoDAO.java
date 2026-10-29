package dao;

import conexao.ConexaoSQLITE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProdutoDAO {

    public void listarTodosProdutos() {

        String sql = "SELECT * FROM produtos";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            ResultSet resultado = comando.executeQuery(sql);

            while (resultado.next()) {

                System.out.println(
                        resultado.getInt("id") + " - "
                        + resultado.getString("nome") + " - "
                        + resultado.getDouble("valor") + " - "
                        + resultado.getInt("quantidade")
                );

            }

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void inserirProduto() {

        String sql = "INSERT INTO produtos "
                + "(nome, valor, quantidade) "
                + "VALUES ('Placa de Jogos', 2000, 10)";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Produto inserido!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
    // Deletar Produto

    public void deletarProduto() {

        String sql = "DELETE FROM produtos WHERE id = 13";

        try {

            Connection conexao = ConexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Produto excluído!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}
