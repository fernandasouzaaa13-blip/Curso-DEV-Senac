/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;

public class AgendaModel {

    // CREATE :GRAVA um contato novo no banco
    public void inserir(String nome, String email, String telefone) {
        //os? sãp "buracos" que serão preenchidos logo abaixo
        String sql = "INSERT INTO contato"
                + "(nome, email, telefone) "
                + "VALUES (?,?,?)";
        try {
            //pede uma conexão aberta para a classe Conexao
            Connection con = Conexao.conectar();
            //prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);
            //preenche cada? na ordem (1,2,3) com os parâmetros recebidos
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, telefone);
            //executa o comando (INSERT,UPDATE e DELETE usam executeUpdate)
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception erro) {
            System.out.println("Erro ao inserir: " + erro.getMessage());
        }
    }
    // ===== R = READ: devolve todos os contatos (uma linha = um Object[]) =====

    public ArrayList<Object[]> listarTodos() {
        ArrayList<Object[]> linhas = new ArrayList<>();
        String sql = "SELECT id, nome, email, telefone FROM contato ORDER BY nome";

        try (Connection con = Conexao.conectar(); // Executar a SQL acima
                 PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            //montando a lista de todos registros
            while (rs.next()) {
                Object[] linha = {
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("telefone")
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

    public String atualizar(int id, String nome, String email, String telefone) {
        String sql = "UPDATE contato SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        try {
            // pede uma conexão aberta para a classe Conexao
            Connection con = Conexao.conectar();

            // prepara o comando SQL
            PreparedStatement ps = con.prepareStatement(sql);

            // preenche cada ? na ordem (1, 2, 3, 4)
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, telefone);
            ps.setInt(4, id); // o id vem por último, na posição do WHERE

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
        String sql = "DELETE FROM contato WHERE id = ?";
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
}
