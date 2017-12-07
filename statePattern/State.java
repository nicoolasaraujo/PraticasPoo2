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
public abstract class State {

    private Jogador player;

    private int lowerLimitLife;
    private int UpperLimitLife;

    public State(Jogador player) {
        this.player = player;

        setLimits();
    }

    public Jogador getPlayer() {
        return player;
    }

    public void setPlayer(Jogador player) {
        this.player = player;
    }

    public int getLowerLimitLife() {
        return lowerLimitLife;
    }

    public void setLowerLimitLife(int lowerLimitLife) {
        this.lowerLimitLife = lowerLimitLife;
    }

    public int getUpperLimitLife() {
        return UpperLimitLife;
    }

    public void setUpperLimitLife(int UpperLimitLife) {
        this.UpperLimitLife = UpperLimitLife;
    }

    public abstract void setLimits();

    public void setLife(int life) {
        this.player.setVida(life);
        this.checkAlterLife();
    }

    public abstract void checkAlterLife();

}
