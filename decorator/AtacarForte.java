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
public class AtacarForte extends Atacar {

    public AtacarForte() {
        setAtaques("Ataque Forte");
        setDanoDeAtaque(45);
    }

    @Override
    public int getDanoDeAtaque() {
        return this.danoDeAtaque;
    }

    @Override
    public String getAtaques() {
        return this.ataques;
    }

}
