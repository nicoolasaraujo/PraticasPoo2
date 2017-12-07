/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statePattern;

import decorator.AtacarMedio;
import praticas.CorrerMedio;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class NormalState extends State {

    public NormalState(Jogador player) {
        super(player);
        this.getPlayer().setA(new AtacarMedio());
        this.getPlayer().setC(new CorrerMedio());
    }

    @Override
    public void setLimits() {
        setUpperLimitLife(70);
        setLowerLimitLife(30);

    }

    @Override
    public void checkAlterLife() {
        if (this.getPlayer().getVida() > getUpperLimitLife()) {
            this.getPlayer().setState(new StrongState(this.getPlayer()));
        } else if (this.getPlayer().getVida() <= getLowerLimitLife()) {
            this.getPlayer().setState(new WeakState(this.getPlayer()));
            this.getPlayer().getState().checkAlterLife();
        }
    }

}
