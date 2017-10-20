/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import decorator.AtacarForte;
import decorator.Atacar;

/**
 *
 * @author a
 */
public class Jogador1 extends Jogador {

    public Jogador1() {
        setA(new AtacarForte());
        setC(new CorrerMedio());
        setP(new PuloMedio());
        setVida(300);

    }

}
