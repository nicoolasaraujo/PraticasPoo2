/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.AtacarForte;

/**
 *
 * @author Nicolas
 */
public class Jogador4 extends Jogador {

    public Jogador4() {
        setA(new AtacarForte());
        setC(new CorrerRapido());
        setP(new PuloAlto());

    }
}
