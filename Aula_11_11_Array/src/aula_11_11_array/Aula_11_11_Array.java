/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_11_11_array;
import java.util.Random;


/**
 *
 * @author profj
 */
public class Aula_11_11_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teste();
    }
    
    public static void Teste(){
        int[][] n = new int[3][2];
       
        n[0][0] = 2;
        n[0][1] =45; 
        n[1][0] =145; 
        n[1][1] =457; 
        
        System.out.println("n.length " + n.length);
        System.out.println("n[0].length " + n[0].length);
        
        for(int linha=0; linha<n.length; linha++){
            for(int coluna=0; coluna<n[0].length; coluna++){
                System.out.print(n[linha][coluna] + "-- ");
            }
            System.out.println();
        }
        
    }
    
    public static void Randomica(){
        int[] frequencia = new int[7];
        Random numero = new Random();
        for(int roll=1; roll<=600; roll++){
            ++frequencia[1+numero.nextInt(5)];
        }
        for( int controle=0; controle<frequencia.length; controle++){
            System.out.println("frequencia[" + controle + "]=" + frequencia[controle]);
        }
    }
    
    public static void Barras(){
        int[] array ={5, 0, 0, 10, 0, 0, 1, 2, 4, 2, 1}; 
        for(int controle=0; controle<array.length;controle++){
            if(controle==10){
                System.out.printf("%5d:  ", 100);
            } else {
                System.out.printf("%02d-%02d:  ", controle*10, controle *10 +9);
            }
            for(int interno=0; interno<array[controle]; interno++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void Declarao(){
        // declaração
        int c[] ;
        c = new int[12];
        int[] b = new int[12]; 
        String[] x = new String[12];
        int[] valores = {12,14,17,35,85,99};
        
        // inicializar 
        c[0] = 12; 
        c[1] = c[0]+1;
        System.out.println("----------- variavel c");
        for(int controle=0; controle< c.length; controle++){
            System.out.println("c[" + controle + "]=" + c[controle]);
        }
        System.out.println("----------- variavel valores");
        int soma=0;
        for(int controle=0; controle< valores.length; controle++){
            System.out.println("valores[" + controle + "]=" + valores[controle]);
            soma = soma + valores[controle];
        }
    }
}
