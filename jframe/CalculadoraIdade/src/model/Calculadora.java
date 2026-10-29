/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Calculadora {
    private double anoNascimento;
    private double anoAtual;
    
public Calculadora(double anoNascimento,double anoAtual){
    this.anoNascimento= anoNascimento;
    this.anoAtual= anoAtual;
}
public double CalcularAno(){
    return  anoAtual - anoNascimento;
    
}
    
    
    
}
