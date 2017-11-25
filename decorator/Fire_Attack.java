/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.Atacar;
import decorator.Atacar;
import decorator.DecoradorAtaque;
import decorator.DecoradorAtaque;

/**
 *
 * @author Nicolas
 */
public class Fire_Attack extends DecoradorAtaque {

    public Fire_Attack(Atacar ataque) {
        super(ataque);

    }

    @Override
    public int getDanoDeAtaque() {
        return getAtaqueBuffado().danoDeAtaque * 3;
    }

    @Override
    public String getAtaques() {
        return "Fire_Attack";
    }

}
