/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Conversor {
    private double valorReal;

    public Conversor(double valorReal) {
        this.valorReal = valorReal;
    }
    
    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }
    
    public double coverterParaDolar(){
        return valorReal/5.4;
    }
    
    
}
