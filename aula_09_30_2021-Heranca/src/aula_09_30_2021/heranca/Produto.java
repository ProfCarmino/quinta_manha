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
public class Produto {
    private String nome; 
    private double valorBase; 
    
    // metodo construtor Produto() com sobrecarca 
    public Produto(){
        // por enquanto não faz nada 
    }
    public Produto( String nome, double valorBase){
        this.nome = nome; 
        this.valorBase = valorBase; 
    }
    
    //--- get e set (ler e atribuir respectivamente)
    public String getNome(){
        return this.nome; 
    }
    public double getValorBase(){
        return this.valorBase;
    }
    public void setNome(String ParamNome){
        this.nome = ParamNome; 
    }
    public void setValorBase( double ParamValorBase){
        this.valorBase = ParamValorBase; 
    }
    
    public double calcularPreco(){
        return getValorBase(); 
    }
}
