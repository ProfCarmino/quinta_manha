/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10_14_2021;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author profj
 */
public class Aula_10_14_2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        new TelaExemplo().setVisible(true);
       /* SwingUtilities.invokeLater(()-> {
        criarTela();});*/
    }
    
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor"); 
        JTextField celsiusTxtField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("ºC");
        JButton converterButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,2,4,4));
        painelDeConteudo.add(celsiusTxtField); 
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(valorConvertidoLabel);
        
        converterButton.addActionListener((e)->{
        double celsius = Double.parseDouble(celsiusTxtField.getText());
        double fah = celsius / 5 * 9 + 32 ;
        valorConvertidoLabel.setText(String.format("%.2f\u00B0F",fah));
        });
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        
    }
    public static void criarTela1(){
        // instanciando um objeto JFrame 
        JFrame tela = new JFrame("Ola mundo"); 
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // label 
        JLabel Ola = new JLabel("Ola mundo") ; 
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(Ola);
        tela.pack();
        tela.setVisible(true);
    }
    
}
