/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inimigos;

import decorator.Atacar;
import factoryMethod.Elemento;
import java.util.Observer;
import java.util.Observable;
import praticas.Jogador;

/**
 *
 * @author a
 */
public abstract class Inimigo implements Observer, Elemento {

    @Override
    public void update(Observable o, Object arg) {
        Jogador j = (Jogador) o;
        System.out.println("Inimigo ");
        System.out.println("X:" + j.getPos_x());
        System.out.println("Y:" + j.getPos_y());
    }

    @Override
    public abstract void confrontar(Jogador jogador);

    private Atacar ataque;

    public Atacar getAtaque() {
        return ataque;
    }

    public void setAtaque(Atacar ataque) {
        this.ataque = ataque;
    }

}
