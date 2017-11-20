/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonSimpleFactory;

import poderes.GenkiDamaMedium;
import poderes.KaiokenMedium;
import poderes.KamehamehaMedium;
import poderes.SuperSaiyajin1Medium;
import poderes.SuperSaiyajin2Medium;
import decorator.*;
import poderes.KamehamehaMedium;
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
                j.setA(new KamehamehaMedium(j.getA()));
                j.setA(new KaiokenMedium(j.getA()));
                j.setA(new SuperSaiyajin1Medium(j.getA()));
            } else if (0.2 < n && n <= 0.4) {
                j = new Jogador2();
                j.setA(new GenkiDamaMedium(j.getA()));
                j.setA(new KaiokenMedium(j.getA()));
            } else if (0.4 < n && n <= 0.6) {
                j = new Jogador3();
                j.setA(new KaiokenMedium(j.getA()));

            } else if (0.6 < n && n <= 0.8) {
                j = new Jogador4();
                j.setA(new SuperSaiyajin1Medium(j.getA()));

            } else if (0.8 < n && n <= 1.0) {
                j = new Jogador5();
                j.setA(new SuperSaiyajin2Medium(j.getA()));
                j.setA(new KaiokenMedium(j.getA()));
                j.setA(new GenkiDamaMedium(j.getA()));
            }
        }

        System.out.println(
                "Advanced\nValor: " + n);
        System.out.println("Dano: " + j.getA().getAtaques() + "\t" + j.getA().getDanoDeAtaque() + "\n");

        return j;

    }

}
