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
public class GenkiDamaEasy extends DecoradorAtaque {

    public GenkiDamaEasy(Atacar ataque) {
        super(ataque);
        setDanoDeAtaque(1100);
        setAtaques("GenkiDama");
    }

}
