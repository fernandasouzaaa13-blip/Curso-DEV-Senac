/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Adriene
 */
public class Desconto {
    
    private String produto;
    private double preco;
    private double desconto;

    public Desconto(String produto, double preco, double desconto) {
        this.produto = produto;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double calcularDesconto() {
        return preco * (desconto / 100);
    }

    public double calcularPrecoFinal() {
        return preco - calcularDesconto();
    }

    public String getProduto() {
        return produto;
    }
    
}
