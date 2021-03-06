/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inimigos;

import Inimigos.Inimigo;
import decorator.AtacarMedio;
import java.util.Observable;
import praticas.Jogador;

/**
 *
 * @author a
 */
public abstract class Inimigo1 extends Inimigo {

    public Inimigo1() {
        this.setAtaque(new AtacarMedio());

    }

    @Override
    public void update(Observable o, Object arg) {
        Jogador j = (Jogador) o;
        System.out.println("Eu sou o inimigo 1");
        System.out.println("Você está na posição:");
        System.out.println("X:" + j.getPos_x());
        System.out.println("Y:" + j.getPos_y());
    }

    @Override
    public abstract void confrontar(Jogador jogador);

}
