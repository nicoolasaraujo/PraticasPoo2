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
public class SuperSaiyajin1 extends DecoradorAtaque {

    public SuperSaiyajin1(Atacar ataque) {
        super(ataque);
        setDanoDeAtaque(900);
        setAtaques("Super Saiyajin 1");
    }

}
