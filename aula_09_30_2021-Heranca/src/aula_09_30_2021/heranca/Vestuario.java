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
public class Vestuario extends Produto{
    private int quantidade; 
    public Vestuario(){
        super();
        
    }
    public Vestuario(String nome, double valorBase){
        super(nome, valorBase); 
        
    }
    public void setQuantidade( int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    @Override
    public double calcularPreco(){
        return super.calcularPreco()*(double)quantidade;
    }   
}
