/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_09_23_2021.intro.oop;

/**
 *
 * @author profj
 */
public class Personagem {
    private String nome;
    private int energia;
    private int fome; 
    private int sono;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @return the fome
     */
    public int getFome() {
        return fome;
    }

    /**
     * @return the sono
     */
    public int getSono() {
        return sono;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    /**
     * @param fome the fome to set
     */
    public void setFome(int fome) {
        this.fome = fome;
    }

    /**
     * @param sono the sono to set
     */
    public void setSono(int sono) {
        if(sono >= 0 && sono <= 100){
            this.sono = sono;
        }
    }
    
    private void Status(){
        System.out.println("Energia: " + this.energia);
        System.out.println("Fome   : " + this.fome) ;
        System.out.println("Sono   : " + this.sono) ;
    }
            
    public Personagem(){
        System.out.println("criei o meu personagem");
        this.energia = 0;
        this.fome = 20;
        this.sono = 55; 
    }
    
    public Personagem(String nome){
        System.out.println("criei o meu personagem com parametro nome");
        this.nome = nome; 
        this.energia = 100;
        this.fome = 15;
        this.sono = 100; 
    }
    
    public void cacar(){
        System.out.println(this.getNome() + " está caçando");
        Status();
    }
    
    public void comer(){
        System.out.println("A fome do " + this.getNome() + " é de " + this.getFome());
        System.out.println(this.getNome() + " está comendo");
        Status();
    }
    
    public void dormir( int status){
        String valor_dormir = (status == 0? "noite" : "tarde"); // operador ternário <condição>? <verdadiro>: <falso>
        System.out.println(this.getNome() + " está dormindo a " + valor_dormir);
        Status();
    }
    
    public void dormir( boolean status){
        String valor_dormir; 
        if(status) {
            valor_dormir = "noite";
        } else {
            valor_dormir = "tarde";
        }
        System.out.println(this.getNome() + " está dormindo a " + valor_dormir);
        Status();
    }
    
  
}
