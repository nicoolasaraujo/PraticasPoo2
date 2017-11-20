/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poderes;

import decorator.Atacar;
import decorator.DecoradorAtaque;

/**
 *
 * @author Nicolas
 */
public class SuperSaiyajin1Hard extends DecoradorAtaque {

    public SuperSaiyajin1Hard(Atacar ataque) {
        super(ataque);
        setDanoDeAtaque(700);
        setAtaques("Super Saiyajin 1");
    }

}
