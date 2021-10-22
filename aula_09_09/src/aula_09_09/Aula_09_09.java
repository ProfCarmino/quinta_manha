/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_09_09;

import javax.swing.JOptionPane;

/**
 *
 * @author profj
 */
public class Aula_09_09 {

    /**
     * @param args the command line arguments
     */
    
    private String variavelPublica = "Arisa"; //atributo 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String retorno; 
        retorno = exemplofuncao1(false, 100, "George");
        JOptionPane.showMessageDialog(null, "valor da variavel retorno="+retorno);
        */
        exemplovetor1();
    }
        
    public static String exemplofuncao1( boolean exetuarsegunda, int valor, String nome){
        String retorno; 
        JOptionPane.showMessageDialog(null,"Executei exemplofuncao1 " + " variavel valor =" + valor + " variavel nome=" + nome);
        if(exetuarsegunda) {
            exemplofuncao();
            retorno = "executou exemplofuncao";
        } else {
            JOptionPane.showMessageDialog(null, "o if está com condição falsa");
            exemplofor();
            retorno = "executou exemplofor ";
        }
        return retorno;
    }
    
    public static void exemplofuncao(){
        JOptionPane.showMessageDialog(null,"Executei exemplofuncao ");
        exemplowhile();
    }
    
    public static void exemplowhile(){
        double nota1, nota2; 
        int contador; 
        contador =1;
        while(contador <=2){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2"));
            JOptionPane.showMessageDialog(null,"Média: " + (nota1+nota2)/2 + " valor do contador " + contador);
            contador = contador + 1; 
        }
    }
    
    public static void exemplofor(){
        double nota1, nota2; 
        int contador;
        for(contador=1; contador <=2; contador = contador +1){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2"));
            JOptionPane.showMessageDialog(null,"Média: " + (nota1+nota2)/2 + " valor do contador " + contador);
        }
    }
    
    public static void exemplovetor1(){
        int vetor[];
        vetor = new int[2];
        
        int vetor1[] = new int[5];
        String nome[] = new String[5];
        
        int matriz[][] = new int[2][2];
        matriz[0][0]=12; 
        matriz[0][1]=13; 
        matriz[1][0]=14; 
        matriz[1][1]=15; 
        
        System.out.println( "matriz[0][0] = " + matriz[0][0]);
        System.out.println( "matriz[0][1] = " + matriz[0][1]);
        System.out.println( "matriz[1][0] = " + matriz[1][0]);
        System.out.println( "matriz[1][1] = " + matriz[1][1]);
        System.out.println("---------------------------------------");
        int linha, coluna; 
        for(linha=0; linha <=1; linha = linha +1){
            for(coluna=0; coluna <= 1; coluna++){ // coluna++ equivale a coluna = coluna + 1 ou coluna+=1;
                if(matriz[linha][coluna]>=14){
                    System.out.println( "matriz[" + linha + "][" + coluna + "] = " + matriz[linha][coluna]);
                }
            }
        }
        
        vetor[0] = 10;
        vetor[1] = 15;
        //JOptionPane.showMessageDialog(null, "vetor[0] = " + vetor[0] + " vetor[1]=" + vetor[1]);
    }
}
