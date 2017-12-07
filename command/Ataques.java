/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import decorator.Atacar;

/**
 *
 * @author Nicolas
 */
public class Ataques implements Command {

    Atacar ataque;

    public Ataques(Atacar ataque) {
        this.ataque = ataque;
    }

    public void execute() {
        this.ataque.getDanoDeAtaque();
    }

}
