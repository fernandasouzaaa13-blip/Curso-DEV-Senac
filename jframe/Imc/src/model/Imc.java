package model;

import view.Tela;

public class Imc {

    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcular() {
        return peso / (altura * altura);
    }

    public String classificar() {

        double imc = calcular();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
