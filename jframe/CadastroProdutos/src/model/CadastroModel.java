/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author 1104695
 */
public class CadastroModel {
    // CREATE :GRAVA um contato novo no banco
    public void inserir(String nome, String categoria, Double preco, int estoque) {
        //os? sãp "buracos" que serão preenchidos logo abaixo
        String sql = "INSERT INTO CadastroProdutos"
                + "(nome, categoria, preco, estoque) "
                + "VALUES (?,?,?,?)";
        try {
            //pede uma conexão aberta para a classe Conexao
            Connection con = Conexao.conectar();
            //prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);
            //preenche cada? na ordem (1,2,3) com os parâmetros recebidos
            ps.setString(1, nome);
            ps.setString(2, categoria);
            ps.setDouble(3, preco);
            ps.setInt(4, estoque);
            //executa o comando (INSERT,UPDATE e DELETE usam executeUpdate)
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception erro) {
            System.out.println("Erro ao inserir: " + erro.getMessage());
        }
    }
    
    public String atualizar(int id, String nome, String categoria, double preco, int estoque) {
        String sql = "UPDATE CadastroProdutos SET nome = ?, categoria = ?, preco = ?, estoque=? WHERE id = ?";

        try {
            // pede uma conexão aberta para a classe Conexao
            Connection con = Conexao.conectar();

            // prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            // preenche cada ? na ordem (1, 2, 3, 4, 5)
            ps.setString(1, nome);
            ps.setString(2, categoria);
            ps.setDouble(3, preco);
            ps.setInt(4, estoque);
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
    
    //D = DELETE: apaga o contato que tem o id informado
    public String excluir(int id) {
        String sql = "DELETE FROM CadastroProdutos WHERE id = ?";
        try {
            Connection con = Conexao.conectar();
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
        String sql = "SELECT id, nome, categoria, preco, estoque FROM CadastroProdutos ORDER BY id";

        try (Connection con = Conexao.conectar(); // Executar a SQL acima
                 PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            //montando a lista de todos registros
            while (rs.next()) {
                Object[] linha = {
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("categoria"),
                    rs.getDouble("preco"),
                    rs.getInt("estoque")
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
