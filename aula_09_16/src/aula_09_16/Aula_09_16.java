/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_09_16;

import java.util.Scanner;

/**
 *
 * @author profj
 */
public class Aula_09_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercicio08();
    }
    
    public static void Exercicio08(){
        /*
        Construa uma função que calcule a média aritmética 
        dos valores de um vetor de inteiros
        */
        //int vetor[] ={15, 12, 20, 25, 24, 55, 61};
        int vetor[] = new int[7];
        vetor[0] = 15;
        vetor[1] = 12;
        vetor[2] = 20; 
        vetor[3] = 25; 
        vetor[4] = 24;
        vetor[5] = 55;
        vetor[6] = 61;
        //MinhaEntrada(vetor);
        int indice; 
        int soma; 
        soma =0; 
        for(indice=0;indice < vetor.length; indice ++ ){
            soma = soma + vetor[indice];
        }
        System.out.println("Media aritimetica é " + soma / vetor.length);
        System.out.println("Media aritimetica é " + ((float)soma / vetor.length));
    }
    public static void Exercicio07(){
        /*
        Escreva uma função que percorre um vetor (o vetor deve ter 
        um tamanho mínimo de 5 elementos) de inteiros encontrando o maior 
        e o menor valor, exibindo os dois valores na tela.
        */
        int vetor[] ={15, 12, 20, 25, 24, 55, 61};
        // maior é 61 e o menor é 12
        MinhaEntrada(vetor);
        int indice; 
        int menor, maior; 
        menor = vetor[0];
        maior = vetor[0];
        for(indice=1;indice < vetor.length; indice ++ ){
            if(vetor[indice]>maior){
                maior = vetor[indice];
            } 
            if(vetor[indice]<menor){
                menor = vetor[indice];
            }
        }
        System.out.println("Menor = " + menor + " maior = " + maior);
    }
    
    public static void MinhaEntrada( int v[]){
        int indice;
        Scanner entrada = new Scanner(System.in);
        indice = 0; 
        while(indice < v.length){
            System.out.println("Digite o valor para o v[" + indice + "]");
            v[indice] = entrada.nextInt();
            indice ++; // indice = indice + 1;
        }
    }
    public static void Exercicio06(){
        /*
        Elabore uma função usando a estrutura de repetição for, que 
        percorra um vetor de inteiros e conte quantos números estão no 
        intervalor de 10 a 20 e quantos não estão 
        (considere que os números 10 e 20 estão no intervalo). 
        Exiba o total das contagens na tela.
        */
        //  indice     0,  1,  2,  3,  4,  5,  6
        int vetor[] ={15, 12, 20, 25, 24, 55, 61};
        MinhaEntrada(vetor);
        
        int indice; 
        int intervalo, nintervalo; 
        intervalo = nintervalo = 0;       
        for(indice=0; indice < vetor.length; indice = indice + 1){
            if( vetor[indice] >=10 && vetor[indice]<=20){
                intervalo ++;
            } else {
                nintervalo ++; 
            }
        }
        System.out.println("estão no intervalo " + intervalo + 
                           " não estão no intervalo " + nintervalo +
                           " não estão no intervalo " + (vetor.length - intervalo));
        indice = intervalo = nintervalo = 0; 
        while(indice < vetor.length){
            if( vetor[indice] >=10 && vetor[indice]<=20){
                intervalo ++;
            } else {
                nintervalo ++; 
            }
            indice = indice + 1; 
        }
        System.out.println("estão no intervalo " + intervalo + 
                           "\n não estão no intervalo " + nintervalo +
                           "\n não estão no intervalo " + (vetor.length - intervalo));
    }
    
    
    public static void Exercicio05(){
        /*
        Escreva uma função que lê um vetor de números inteiros e 
        conte quantos são pares e quantos são ímpares.
        */
        int v[]={0,1,2,3,4,5,6};
        int indice;
        MinhaEntrada(v);
        /*
        v[0] = 11
        v[3] = 8
        */
        for(indice=0; indice < v.length; indice++ ){
            if((v[indice]%2)==0){
                System.out.println("numero par " + v[indice]);
            }
        }
    }
    public static void Exercicio04(){
        /*
        Escreva uma função que imprima todos os números pares entre 1 e 200.
        */
        int contador; 
        // contador += 2 é equivalente a contador = contador + 2;
        // 2, 4, 6, 8 ,10, 12...
        for(contador=2; contador<=200; contador+=2){
            System.out.println("Numero par: " +contador);
        }
        System.out.println("---------------------------");
        for(contador=1; contador <=200; contador++){
            if((contador%2) == 0 ){
                System.out.println("Numerp par: " + contador);
            }
        }
    }
    public static void Exercicio03(){
        /*
        Escreva uma função e exibe os números de 1 a 50.
        */
        int contador;
        contador =1;
        while(contador <=50){
            System.out.println("Numero: " + contador);
            contador += 1;
        }
        System.out.println("------------------" + contador);
        for(contador=1;contador<=50;contador+=1){
            System.out.println("Numero: " + contador);
        }
        
    }
    public static void Exercicio02(){
        /*
        Elabore uma função que imprima 11 vezes a frase “Ola mundo”, 
        deve-se obrigatoriamente utilizar uma estrutura de repetição 
        “for” [for(atribuição; condição; incremento)]
        */
        int contador; 
        for(contador=1; contador<=11; contador++){
            System.out.println("Ola mundo");
        }
        System.out.println("--------------------");
        for(contador=1;contador<=11;){
            System.out.println("Ola mundo ----");
            contador++;
        }
        System.out.println("++++++++++++++++++++++");
        contador = 1;
        for(;;){
            System.out.println("Ola mundo +++++++");
            contador++; // equivalente contador = contador + 1;
            if(contador>11){
                break; 
            }
        }
    }
    
    public static void Exercicio01(){
        /*
        Elabore uma função que imprima 11 vezes a frase “Ola mundo”, 
        deve-se obrigatoriamente utilizar uma estrutura de repetição 
        “while” [while(condição)]
        */
        int contador; 
        contador = 1; 
        while(contador<=11){
            System.out.println("Ola mundo ");
            /*
            contador ++;
            contador += 1;
            */
            contador = contador + 1;
        }
    }
}
