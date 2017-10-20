/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Nicolas
 */
public class SuperSaiyajin2 extends DecoradorAtaque {

    public SuperSaiyajin2(Atacar ataque) {
        super(ataque);
        setDanoDeAtaque(1200);
        setAtaques("Super Saiyajin 2");
    }

}
