/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.AtacarMedio;

/**
 *
 * @author a
 */
public class Jogador2 extends Jogador {

    public Jogador2() {
        setA(new AtacarMedio());
        setC(new CorrerRapido());
        setP(new PuloAlto());

    }
}
