/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respquestao;

public class Produto {
    private int codigo; 
    private String descricao; 
    private int entradas;
    private int saidas; 

    public Produto( int codigo, String descricao ){
        this.codigo = codigo;
        this.descricao = descricao; 
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getEntradas() {
        return entradas;
    }
    public int getSaidas() {
        return saidas;
    }
    
    public boolean MovEstoque(int codigo, int quantidade, int tipomove){
        if(tipomove == 1){
            entradas += quantidade; 
            return true; 
        } else if(tipomove == 2){
            saidas += quantidade;
        }
        return false;
    }    
}
