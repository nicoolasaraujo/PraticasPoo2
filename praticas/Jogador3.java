/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.AtacarForte;

/**
 *
 * @author a
 */
public class Jogador3 extends Jogador {

    public Jogador3() {
        setA(new AtacarForte());
        setC(new CorrerRapido());
        setP(new PuloBaixo());

    }

}
