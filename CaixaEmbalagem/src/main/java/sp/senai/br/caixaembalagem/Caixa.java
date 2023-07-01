/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.caixaembalagem;

/**
 *
 * @author aluno
 */
public class Caixa {
    
    public static void main(String[] args){
        
        Main Caixa = new Main();
        
       Caixa.setComprimento(15);
       Caixa.setAltura(45);
       Caixa.setLargura(10);
       
       Caixa.setVolume(0);
       
       double Volume = Caixa.getVolume();
       
        System.out.printf("O volume e: %s", Volume);
        
       
    }
    
}
