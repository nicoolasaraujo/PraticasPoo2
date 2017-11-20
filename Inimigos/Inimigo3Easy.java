/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inimigos;

import java.util.Observable;
import Inimigos.Inimigo1;
import praticas.Jogador;

/**
 *
 * @author a
 */
public class Inimigo3Easy extends Inimigo2 {

    @Override
    public void confrontar(Jogador jogador) {
        if (jogador.getA().getAtaques().contains("Fraco")) {
            jogador.setVida(jogador.getVida() - 45);
            System.out.println("O inimigo 3 te atacou! -100");
        } else if (jogador.getA().getAtaques().contains("Forte")) {
            jogador.setVida(jogador.getVida() - 40);
            System.out.println("O inimigo 3 te atacou! -30");
        } else {
            System.out.println("Inimigo3: 'Você teve sorte dessa vez!!'");
        }
    }

}
