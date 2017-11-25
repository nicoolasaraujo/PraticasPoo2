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
public class Wind_Attack extends DecoradorAtaque {

    public Wind_Attack(Atacar ataque) {
        super(ataque);

    }

    @Override
    public int getDanoDeAtaque() {
        return getAtaqueBuffado().danoDeAtaque * 2;
    }

    @Override
    public String getAtaques() {
        return "Wind_Attack";
    }

}
