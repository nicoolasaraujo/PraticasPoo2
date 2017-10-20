package singletonSimpleFactory;

import praticas.Jogador;
import praticas.Jogador1;
import praticas.Jogador2;
import praticas.Jogador3;
import praticas.Jogador4;
import praticas.Jogador5;

/**
 *
 * @author Nicolas
 *
 *
 * ***************** Importante **********************
 *
 * Para esta classe o padrão de decorator não foi utilizado, apenas foram
 * criados 5 tipos diferentes de jogador, os decorator serão utilizados na
 * criação de personagens randomicos
 *
 */
public class SimplePersonFactory {

    private static Jogador j = null;

    public static Jogador getJ() {
        return j;
    }

    public static void setJ(Jogador j) {
        SimplePersonFactory.j = j;
    }

    public static synchronized Jogador createJogador() {

        double n = Math.random();
        if (j == null) {
            if (n <= 0.2) {
                j = new Jogador1();
//            j.setA(new Kamehameha(j.getA()));
//            j.setA(new Kaioken(j.getA()));
            } else if (0.2 < n && n <= 0.4) {
                j = new Jogador2();
//            j.setA(new GenkiDama(j.getA()));
//            j.setA(new Kaioken(j.getA()));
            } else if (0.4 < n && n <= 0.6) {
                j = new Jogador3();

            } else if (0.6 < n && n <= 0.8) {
                j = new Jogador4();
//            j.setA(new GenkiDama(j.getA()));

            } else if (0.8 < n && n <= 1.0) {
                j = new Jogador5();
//            j.setA(new GenkiDama(j.getA()));
//            j.setA(new Kaioken(j.getA()));
//            j.setA(new Kamehameha(j.getA()));
            }
        }
        System.out.println("Simple\nValor: " + n);
        System.out.println("Dano: " + j.getA().getAtaques() + "\t" + j.getA().getDanoDeAtaque() + "\n");

        return j;
    }

}
