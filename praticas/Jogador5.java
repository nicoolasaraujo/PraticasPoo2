/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.AtacarFraco;

/**
 *
 * @author Nicolas
 */
public class Jogador5 extends Jogador {

    public Jogador5() {
        setA(new AtacarFraco());
        setC(new CorrerDevagar());
        setP(new PuloBaixo());
        setVida(250);
    }

}
