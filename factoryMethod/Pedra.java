/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class Pedra extends Obstaculo {

    @Override
    public void confrontar(Jogador jogador) {
        if (!jogador.getA().getAtaques().contains("Super Saiyajin") || !jogador.getP().pular().contains("Alto")) {
            jogador.setVida(jogador.getVida() - 10);
            System.out.println("Levou 10 de dano");
        } else {
            System.out.println("Desviou");
        }

    }

}
