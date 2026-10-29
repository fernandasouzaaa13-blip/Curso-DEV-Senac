/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String validarLogin() {
        if (usuario.equals("Admin") && senha.equals("12345")) {
            return "Acesso Liberado";
        } else {
            return "Acesso Negado";
        }
    }

}
