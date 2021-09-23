/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
1. Adicione um método à classe Personagem que exibe o estado (valores de energia, fome e sono) 
dos objetos. Chame ele em cada método existente na sua classe. Ele deve exibir o nome do 
personagem seguido dos valores de cada variável.

2. Adicione um novo personagem e inclua ele no “loop do jogo”.

 */

/*
o que é um atributo? é uma caracteristica do objeto 
o que é um metodo? é uma ação do objeto 
quem define um objeto? é a classe 
o que é sobrecarga? metodos de tem o mesmo nome, mas com funcionalides diferentes 

*/
package aula_09_23_2021.intro.oop;

/**
 *
 * @author profj
 */
public class Aula_09_23_2021IntroOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("Arisa"); // instancia
        Personagem cacador1 = new Personagem();

        System.out.println("Estamos na linha 20 - A fome do " + cacador.getNome()
                + " fome " + cacador.getFome()
                + " o sono é de " + cacador.getSono());
        cacador.dormir(0);
        cacador1.setNome("Edu");
        System.out.println("Estamos na linha 26 - A fome do " + cacador1.getNome()
                + " fome " + cacador1.getFome()
                + " o sono é de " + cacador1.getSono());
        cacador1.dormir(false);

        {
            cacador.cacar();
            cacador.comer();
            cacador.cacar();
            cacador.cacar();
            System.out.println("====================");
            Thread.sleep(3000);
        }
    }
}
