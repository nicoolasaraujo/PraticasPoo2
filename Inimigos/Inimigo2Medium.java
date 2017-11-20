/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inimigos;

import praticas.Jogador;

/**
 *
 * @author a
 */
public class Inimigo2Medium extends Inimigo2 {

    @Override
    public void confrontar(Jogador jogador) {

        if (jogador.getC().correr().contains("Fraco")) {
            jogador.setVida(jogador.getVida() - 45);
            System.out.println("O inimigo 2 te atacou! -100");
        } else if (jogador.getC().correr().contains("Forte")) {
            jogador.setVida(jogador.getVida() - 30);
            System.out.println("O inimigo 2 te atacou! -30");
        } else {
            System.out.println("Inimigo3: 'Você teve sorte dessa vez!!'");
        }

    }

}
