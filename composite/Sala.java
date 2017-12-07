/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import AbstractFactory.Nivel;
import factoryMethod.Elemento;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public abstract class Sala implements Labirinto {

    public Sala(Labirinto x1, Labirinto x2, Jogador player, Nivel n) {
        this.x1 = x1;
        this.x2 = x2;
        this.player = player;
        this.n = n;
    }

    private String desc;
    private Labirinto x1;
    private Labirinto x2;
    private Jogador player;
    private Elemento elem;
    private Nivel n;

    public Nivel getN() {
        return n;
    }

    public void setN(Nivel n) {
        this.n = n;
    }

    public Elemento getElem() {
        return elem;
    }

    public void setElem(Elemento elem) {
        this.elem = elem;
    }

    public Jogador getPlayer() {
        return player;
    }

    public void setPlayer(Jogador player) {
        this.player = player;
    }

    public Labirinto getX1() {
        return x1;
    }

    public void setX1(Labirinto x1) {
        this.x1 = x1;
    }

    public Labirinto getX2() {
        return x2;
    }

    public void setX2(Labirinto x2) {
        this.x2 = x2;
    }

//    private Elemento elem;
    public Sala(String desc) {
        this.desc = desc;

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
