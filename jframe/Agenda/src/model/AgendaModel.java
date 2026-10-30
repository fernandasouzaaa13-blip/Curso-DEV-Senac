/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;

public class AgendaModel {
    

    // CREATE :GRAVA um contato novo no banco
    public void inserir (String nome,String email,String telefone){
        //os? sãp "buracos" que serão preenchidos logo abaixo
         String sql = "INSERT INTO contato"
                + "(nome, email, telefone) "
                + "VALUES (?,?,?)";
         try {
             //pede uma conexão aberta para a classe Conexao
             Connection con = Conexao.conectar();
             //prepara o comando SQL
             PreparedStatement ps = con.prepareStatement (sql);
             //preenche cada? na ordem (1,2,3) com os parâmetros recebidos
             ps.setString(1,nome);
             ps.setString(2,email);   
             ps.setString(3,telefone);
             //executa o comando (INSERT,UPDATE e DELETE usam executeUpdate)
             ps.executeUpdate();
             ps.close();
             con.close();
         }catch (Exception erro){
             System.out.println("Erro ao inserir: "+ erro.getMessage());
         }
    }
  
}
