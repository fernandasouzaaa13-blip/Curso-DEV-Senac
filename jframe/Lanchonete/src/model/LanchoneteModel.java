/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;  // Representa uma conexão com o banco de dados
import conexao.ConexaoLanchonete;// Importa a classe Conexao do pacote conexao
import java.sql.*;// Importa todas as classes do pacote java.sql
import java.util.ArrayList;// Permite criar listas dinâmicas de elementos

public class LanchoneteModel {

    public void inserir(String nome, String ingredientes, String tamanho, Double preco) {
        //os? sãp "buracos" que serão preenchidos logo abaixo
        String sql = "INSERT INTO Cardapio"
                + "(nome, ingredientes, tamanho, preco) "
                + "VALUES (?,?,?,?)";
        try {
            //pede uma conexão aberta para a classe Conexao
            Connection con = ConexaoLanchonete.conectar();
            //prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);
            //preenche cada? na ordem (1,2,3) com os parâmetros recebidos
            ps.setString(1, nome);
            ps.setString(2, ingredientes);
            ps.setString(3, tamanho);
            ps.setDouble(4, preco);
            //executa o comando (INSERT,UPDATE e DELETE usam executeUpdate)
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception erro) {
            System.out.println("Erro ao inserir: " + erro.getMessage());
        }

    }
     public String atualizar(int id, String nome, String ingredientes, String tamanho, Double preco) {
        String sql = "UPDATE Cardapio SET nome = ?, ingredientes = ?, tamanho = ?, preco=? WHERE id = ?";

        try {
            // pede uma conexão aberta para a classe Conexao
            Connection con = ConexaoLanchonete.conectar();

            // prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            // preenche cada ? na ordem (1, 2, 3, 4, 5)
            ps.setString(1, nome);
            ps.setString(2, ingredientes);
            ps.setString(3, tamanho);
            ps.setDouble(4, preco);
            ps.setInt(5, id); // o id vem por último, na posição do WHERE

            // executa o comando e retorna quantas linhas foram afetadas
            int linhas = ps.executeUpdate();

            ps.close();
            con.close();

            if (linhas > 0) {
                System.out.println("Atualizado Com Sucesso");
                return "Registro Atualizado com Sucesso";
            } else {
                System.out.println("Nenhum contato encontrado com o id " + id);
                return "Registro não Localizado";
            }

        } catch (Exception erro) {
            System.out.println("Erro ao atualizar: " + erro.getMessage());
            return "Erro ao tentar Atualizar";
        }
    }
      public String excluir(int id) {
        String sql = "DELETE FROM Cardapio WHERE id = ?";
        try {
            Connection con = ConexaoLanchonete.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            con.close();
            return "Deletado com Sucesso";
        } catch (Exception erro) {
            System.out.println("Erro ao excluir:" + erro.getMessage());
            return "Erro ao Deletar";
        }
    }
      public ArrayList<Object[]> listarTodos() {
        ArrayList<Object[]> linhas = new ArrayList<>();
        String sql = "SELECT id, nome, ingredientes, tamanho,preco FROM Cardapio ORDER BY id";

        try (Connection con = ConexaoLanchonete.conectar(); // Executar a SQL acima
                 PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            //montando a lista de todos registros
            while (rs.next()) {
                Object[] linha = {
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("ingredientes"),
                    rs.getString("tamanho"),
                    rs.getDouble("preco")

                };

                linhas.add(linha);
            }

            //mostrar a quantidade de registros no Terminal JAVA
            System.out.println("Quantidade de Registros no Banco: " + linhas.size());
            //retorna para quem chamou todos registros
            return linhas;

        } catch (Exception e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }

        return linhas;
    }

}
