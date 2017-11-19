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
public class AtacarFraco extends Atacar {

    public AtacarFraco() {
        super.setAtaques("Ataque Fraco");
        super.setDanoDeAtaque(10);
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
