/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statePattern;

import decorator.AtacarForte;
import decorator.AtacarMedio;
import praticas.CorrerMedio;
import praticas.CorrerRapido;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class StrongState extends State {

    public StrongState(Jogador player) {
        super(player);
        this.getPlayer().setA(new AtacarForte());
        this.getPlayer().setC(new CorrerRapido());
    }

    @Override
    public void setLimits() {
        setLowerLimitLife(70);

    }

    @Override
    public void checkAlterLife() {
        if (this.getPlayer().getVida() <= getLowerLimitLife()) {
            this.getPlayer().setState(new NormalState(this.getPlayer()));
            this.getPlayer().getState().checkAlterLife();

        }

    }

}
