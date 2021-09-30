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
public class Aula_09_30_2021Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancianado objetos        
        Produto P1 = new Produto();
        Produto P2 = new Produto();
        Produto P3 = new Produto("mais um produto generico", 15);
        Alimento A1 = new Alimento();
        Alimento A2 = new Alimento("feijao", 10);
        Vestuario V1 = new Vestuario();
        
        // atribuição e impressão na tela 
        P1.setNome("Produto generico");
        P2.setNome("Outro produto generico");
        System.out.println("Nome......... : " + P1.getNome());
        System.out.println("Valor base... : " + P1.getValorBase());
        System.out.println("Calcular preco: " + P1.calcularPreco());
               
        
        A1.setNome("arroz"); 
        A1.setValorBase(12.25);
        A1.setPeso(5);
        
        System.out.println("Nome......... : " + A1.getNome());
        System.out.println("Valor base... : " + A1.getValorBase());
        System.out.println("Calcular preco: " + A1.calcularPreco());
        
        V1.setNome("Vestido");
        V1.setValorBase(1234.45); 
        V1.setQuantidade(6);
        
        System.out.println("Nome......... : " + V1.getNome());
        System.out.println("Valor base... : " + V1.getValorBase());
        System.out.println("Calcular preco: " + V1.calcularPreco());

    }
    
}
