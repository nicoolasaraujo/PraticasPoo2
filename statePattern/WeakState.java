/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statePattern;

import decorator.AtacarFraco;
import decorator.AtacarMedio;
import praticas.CorrerDevagar;
import praticas.CorrerMedio;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class WeakState extends State {

    public WeakState(Jogador player) {
        super(player);
        this.getPlayer().setA(new AtacarFraco());
        this.getPlayer().setC(new CorrerDevagar());
    }

    @Override
    public void setLimits() {
        setUpperLimitLife(30);
        setLowerLimitLife(0);
    }

    @Override
    public void checkAlterLife() {
        if (this.getPlayer().getVida() > getUpperLimitLife()) {
            this.getPlayer().setState(new NormalState(this.getPlayer()));
            this.getPlayer().getState().checkAlterLife();
        } else if (this.getPlayer().getVida() <= getLowerLimitLife()) {
            this.getPlayer().setState(new Dead(this.getPlayer()));
        }
    }

}
