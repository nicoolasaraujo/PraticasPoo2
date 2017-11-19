/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.Atacar;
import java.util.Observable;

/**
 *
 * @author
 */
public class Jogador extends Observable {

    private String nome;
    private Pulo p;
    private Correr c;
    private Atacar a;
    private int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pulo getP() {
        return p;
    }

    public void setP(Pulo p) {
        this.p = p;
    }

    public Correr getC() {
        return c;
    }

    public void setC(Correr c) {
        this.c = c;
    }

    public Atacar getA() {
        return a;
    }

    public void setA(Atacar a) {
        this.a = a;
    }

    private int pos_x, pos_y;

    public void mover(int x, int y) {
        setPos_x(x);
        setPos_y(y);
        setChanged();
        notifyObservers();

    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
