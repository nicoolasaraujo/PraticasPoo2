/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import singletonSimpleFactory.SimplePersonFactory;
import singletonSimpleFactory.AdvancedFactory;
import decorator.SuperSaiyajin2;
import factoryMethod.*;

/**
 *
 * Atividades Praticas de 1 a 5 desenvolvidas por : 
	- Nicolas Araujo Nogueira
	- Patrick Coelho Freitas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /*Pratica 2*/
        System.out.println("Pratica 2");
        Jogador j = new Jogador();
        Inimigo2 y = new Inimigo2();
        Inimigo1 b = new Inimigo1();
        Inimigo3 m = new Inimigo3();
        j.addObserver(y);
        j.addObserver(b);
        j.addObserver(m);
        j.mover(5, 10);
        j.mover(6, 10);
        /*Pratica 3 */
        System.out.println("Pratica 3");
        Jogador2 j1 = new Jogador2();
        j1.setA(new SuperSaiyajin2(j1.getA()));
        System.out.println("Dano: " + j1.getA().getAtaques() + "\t" + j1.getA().getDanoDeAtaque());

        /*Pratica 4*/
        System.out.println("Pratica 4");
        Jogador jx = AdvancedFactory.createJogador();
        System.out.println("Segunda instanciação");
        Jogador jxClone = AdvancedFactory.createJogador();

        Jogador jxs = SimplePersonFactory.createJogador();
        System.out.println("Segunda instanciação");
        Jogador jxsClone = SimplePersonFactory.createJogador();

        /*Pratica 5*/
        System.out.println("Pratica 5");
        Jogador j2 = AdvancedFactory.createJogador();
        System.out.println(j2.getA().getAtaques() + " " + j2.getA().getDanoDeAtaque());
        Fase3 f3 = new Fase3();
        f3.jogar(j2);
    }

}
