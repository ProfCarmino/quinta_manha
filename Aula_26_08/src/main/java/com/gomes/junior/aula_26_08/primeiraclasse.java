/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gomes.junior.aula_26_08;

import java.util.Scanner;


/**
 *
 * @author profj
 */
public class primeiraclasse {
    /*
    Ler a cotação do dólar e a quantidade de dólares. 
    Converter para real e mostrar o resultado. 
    */
    public static void main(String[] args) {
        // TODO code application logic here
        exercicio02();
    }
    
    public static void exercicio01(){
        int quant_dolares; 
        double cotacao_dolar; 
        double resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a cotação do dolar: ");
        cotacao_dolar = entrada.nextDouble();
        System.out.println("Informe a quantidade de dolares: ");
        quant_dolares = entrada.nextInt();
        resultado = quant_dolares * cotacao_dolar; 
        System.out.println("Este é o resultado" + resultado);
    }
    
    public static void exercicio02(){
        double a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        a = entrada.nextDouble(); 
        System.out.println("Digite o segundo numero ");
        b = entrada.nextDouble(); 
        System.out.println("Digite o terceiro numero ");
        c = entrada.nextDouble(); 
        System.out.println("Digite o quatto numero ");
        d = entrada.nextDouble(); 
        System.out.println("O resultado é: "+ ((a*a) + (b*b) + (c*c) + (d*d)));     
    }
}
