/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statePattern;

import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class Dead extends State {

    public Dead(Jogador player) {
        super(player);
    }

    @Override
    public void setLimits() {
        setUpperLimitLife(0);
    }

    @Override
    public void checkAlterLife() {
        if (this.getPlayer().getVida() > getUpperLimitLife()) {
            this.getPlayer().setState(new WeakState(this.getPlayer()));
            this.getPlayer().getState().checkAlterLife();

        }
    }

}
