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
public class GenkiDama extends DecoradorAtaque {

    public GenkiDama(Atacar ataque) {
        super(ataque);
        setDanoDeAtaque(1000);
        setAtaques("GenkiDama");
    }

}
