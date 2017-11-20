/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obstaculos;

import factoryMethod.Obstaculo;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class BuracoEasy extends Obstaculo {

    @Override
    public void confrontar(Jogador jogador) {
        if (!jogador.getA().getAtaques().contains("Kaioken") || !jogador.getP().pular().contains("Medio")) {
            jogador.setVida(jogador.getVida() - 20);
            System.out.println("Levou 50 de dano ");
        } else if (!jogador.getC().correr().contains("Medio")) {
            jogador.setVida(jogador.getVida() - 5);
            System.out.println("Levou 20 de dano ");
        } else {
            System.out.println("Desviou!!!");
        }
    }

}
