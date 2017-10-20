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
public class Inimigo3 extends Inimigo {

    public Inimigo3() {

    }

    @Override
    public void update(Observable o, Object arg) {
        Jogador j = (Jogador) o;
        System.out.println("Eu sou o inimigo 3");
        System.out.println("Você está na posição:");
        System.out.println("X:" + j.getPos_x());
        System.out.println("Y:" + j.getPos_y());
    }

    @Override
    public void confrontar(Jogador jogador) {
        if (jogador.getA().getAtaques().contains("Fraco")) {
            jogador.setVida(jogador.getVida() - 100);
            System.out.println("O inimigo 3 te atacou! -100");
        } else if (jogador.getA().getAtaques().contains("Forte")) {
            jogador.setVida(jogador.getVida() - 30);
            System.out.println("O inimigo 3 te atacou! -30");
        } else {
            System.out.println("Inimigo3: 'Você teve sorte dessa vez!!'");
        }
    }

}
