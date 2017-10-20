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
public class BarreiraDaMorte extends Obstaculo {

    @Override
    public void confrontar(Jogador jogador) {
        if (jogador.getA().getDanoDeAtaque() < 500) {
            jogador.setVida(0);
            System.out.println("Você morreu!");
        } else if (jogador.getA().getDanoDeAtaque() > 500 && jogador.getA().getDanoDeAtaque() <= 1500) {
            jogador.setVida(jogador.getVida() - 100);
            System.out.println("Recebeu 100 de dano ");
        } else {
            System.out.println("Você destruiu barreira!!");
        }

    }

}
