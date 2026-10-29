/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Adriene
 */
public class JurosSimples {

    private double capital;
    private double taxa;
    private double tempo;

    public JurosSimples(double capital, double taxa, double tempo) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public double calcularJuros() {
        return capital * (taxa / 100) * tempo;
    }

    public double calcularMontante() {
        return capital + calcularJuros();
    }
}
