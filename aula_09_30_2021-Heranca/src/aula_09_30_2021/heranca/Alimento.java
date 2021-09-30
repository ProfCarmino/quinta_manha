/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_09_30_2021.heranca;

/**
 *
 * @author profj
 */
public class Alimento extends Produto {
    private double peso; 

    public Alimento(){
        super();
        
    }
    public Alimento(String nome, double valorBase){
        super(nome, valorBase);
        
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double calcularPreco(){
        return super.calcularPreco()*peso;
    }
    
}
