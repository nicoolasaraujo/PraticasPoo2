/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import java.util.Observable;

/**
 *
 * @author a
 */
public class Inimigo1 extends Inimigo {

    @Override
    public void update(Observable o, Object arg) {
        Jogador j = (Jogador) o;
        System.out.println("Eu sou o inimigo 1");
        System.out.println("Você está na posição:");
        System.out.println("X:" + j.getPos_x());
        System.out.println("Y:" + j.getPos_y());
    }

    @Override
    public void confrontar(Jogador jogador) {

        if (jogador.getC().correr().contains("Devagar")) {
            jogador.setVida(jogador.getVida() - 50);
            System.out.println("O inimigo 1 te atacou!");
        }

    }

}
