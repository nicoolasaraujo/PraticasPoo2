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
public abstract class DecoradorAtaque extends Atacar {

    private Atacar ataqueBuffado;

    public DecoradorAtaque(Atacar ataque) {
        this.ataqueBuffado = ataque;
    }

    public Atacar getAtaqueBuffado() {
        return ataqueBuffado;
    }

    public void setAtaqueBuffado(Atacar ataqueBuffado) {
        this.ataqueBuffado = ataqueBuffado;
    }

    @Override
    public String getAtaques() {
        return ataqueBuffado.getAtaques() + ", " + this.ataques;
    }

    @Override
    public int getDanoDeAtaque() {
        return ataqueBuffado.getDanoDeAtaque() + this.danoDeAtaque;
    }

}
