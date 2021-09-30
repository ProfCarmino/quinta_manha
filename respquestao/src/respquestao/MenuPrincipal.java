/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respquestao;

import java.util.Scanner;
public class MenuPrincipal {
    public boolean MenuInicial(){
        Scanner entrada = new Scanner(System.in);
        int laco =0; 
        while(laco != 3){
            System.out.println("1 - Cadastro de produtos");
            System.out.println("2 - Cadastro de produtos pereciveis");
            System.out.println("3 - Sair do menu");
            laco = entrada.nextInt();
        }
        return true ;
    }
}
