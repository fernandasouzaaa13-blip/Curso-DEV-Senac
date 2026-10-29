/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Media {

    private double nota1;
    private double nota2;
    private double nota3;

    public Media(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public double CalcularMedia(){
        return (nota1+nota2+nota3) / 3;
    }
    public String Situacao(){
      if(CalcularMedia()>80){
          return "Aprovado!";
      }else{
          return "Reprovado";
      }
    }
}
