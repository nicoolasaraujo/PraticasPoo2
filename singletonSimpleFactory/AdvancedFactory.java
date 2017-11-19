/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonSimpleFactory;

import decorator.*;
import praticas.*;

/**
 *
 * @author Nicolas
 */
public class AdvancedFactory {

    private static Jogador j = null;

    public static Jogador getJ() {
        return j;
    }

    public static void setJ(Jogador j) {
        AdvancedFactory.j = j;
    }

    public static synchronized Jogador createJogador() {

        double n = Math.random();

        if (getJ() == null) {
            if (n <= 0.2) {
                j = new Jogador1();
                j.setA(new Kamehameha(j.getA()));
                j.setA(new Kaioken(j.getA()));
                j.setA(new SuperSaiyajin1(j.getA()));
            } else if (0.2 < n && n <= 0.4) {
                j = new Jogador2();
                j.setA(new GenkiDama(j.getA()));
                j.setA(new Kaioken(j.getA()));
            } else if (0.4 < n && n <= 0.6) {
                j = new Jogador3();
                j.setA(new Kaioken(j.getA()));

            } else if (0.6 < n && n <= 0.8) {
                j = new Jogador4();
                j.setA(new SuperSaiyajin1(j.getA()));

            } else if (0.8 < n && n <= 1.0) {
                j = new Jogador5();
                j.setA(new SuperSaiyajin2(j.getA()));
                j.setA(new Kaioken(j.getA()));
                j.setA(new GenkiDama(j.getA()));
            }
        }

        System.out.println(
                "Advanced\nValor: " + n);
        System.out.println("Dano: " + j.getA().getAtaques() + "\t" + j.getA().getDanoDeAtaque() + "\n");

        return j;

    }

}
