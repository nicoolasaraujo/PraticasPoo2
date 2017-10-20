/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author a
 */
public abstract class Atacar {

    public Atacar() {
    }

//    public abstract void atacar();
    protected int danoDeAtaque;

    protected String ataques;

    public abstract int getDanoDeAtaque();

    public abstract String getAtaques();

//
    public void setAtaques(String ataques) {
        this.ataques = ataques;
    }

    public void setDanoDeAtaque(int danoDeAtaque) {
        this.danoDeAtaque = danoDeAtaque;
    }

//    public String getAtaques() {
//        return this.ataques;
//    }
//    public int getDanoDeAtaque() {
//        return this.danoDeAtaque;
//    }
}
