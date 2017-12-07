/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import Inimigos.Inimigo;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class AtacarPersonagem implements Command {

    private Inimigo enemy;
    private Jogador player;

    public AtacarPersonagem(Inimigo enemy, Jogador player) {
        this.enemy = enemy;
        this.player = player;

    }

    @Override
    public void execute() {
        this.enemy.confrontar(player);

    }

}
