/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.caixaembalagem;

/**
 *
 * @author aluno
 */
public class Main {
    
    public double altura;
    
    public double largura;
    
    public double comprimento;
    
    public double volume;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = this.comprimento * this.altura * this.largura;
    }
    
    
    
}
