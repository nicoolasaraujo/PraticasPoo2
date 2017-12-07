/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import AbstractFactory.Easy;
import AbstractFactory.Medium;
import AbstractFactory.Nivel;
import Inimigos.Inimigo;
import Inimigos.Inimigo1;
import Inimigos.Inimigo1Easy;
import command.Ataques;
import composite.Abismo;
import composite.F1Sala1;
import composite.*;
import composite.Abismo;
import composite.F1Sala1;
import composite.F1Sala2t;
import composite.Labirinto;
import composite.Saida;
import composite.Saida;
import decorator.Fire_Attack;
import decorator.Wind_Attack;
import singletonSimpleFactory.SimplePersonFactory;
import singletonSimpleFactory.AdvancedFactory;
import poderes.SuperSaiyajin2;
import factoryMethod.*;
import poderes.GenkiDama;
import poderes.Kaioken;
import poderes.Kamehameha;
import shields.Shield;
import shields.TShields;

/**
 *
 * Atividades Praticas de 1 a 5 desenvolvidas por : - Nicolas Araujo Nogueira -
 * Patrick Coelho Freitas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Pratica 2

        System.out.println("Pratica 2");
        Jogador j = new Jogador();
        Inimigo2 y = new Inimigo2();
        Inimigo1 b = new Inimigo1Easy();
        Inimigo3 m = new Inimigo3();
        j.addObserver(y);
        j.addObserver(b);
        j.addObserver(m);
        j.mover(5, 10);
        j.mover(6, 10);
        Pratica 3
        System.out.println("Pratica 3");
        Jogador2 j1 = new Jogador2();
        j1.setA(new SuperSaiyajin2(j1.getA()));
        System.out.println("Dano: " + j1.getA().getAtaques() + "\t" + j1.getA().getDanoDeAtaque());

        /*Pratica 4
        System.out.println("Pratica 4");
        Jogador jx = AdvancedFactory.createJogador();
        System.out.println("Segunda instanciação");
        Jogador jxClone = AdvancedFactory.createJogador();

        Jogador jxs = SimplePersonFactory.createJogador();
        System.out.println("Segunda instanciação");
        Jogador jxsClone = SimplePersonFactory.createJogador();

        /*Pratica 5
        System.out.println("Pratica 5");
        Jogador j2 = AdvancedFactory.createJogador();
        System.out.println(j2.getA().getAtaques() + " " + j2.getA().getDanoDeAtaque());
        Fase3 f3 = new Fase3();
        f3.jogar(j2);



         */
 /*Jogador2 j1 = new Jogador2();
        j1.setA(new KaiokenHard(j1.getA()));
        System.out.println("Dano: " + j1.getA().getAtaques() + "\t" + j1.getA().getDanoDeAtaque());*/
//        Jogador j1 = new Jogador1();
//        j1.setShield(new TShields("First_shield"));
//        j1.getShield().setNext(new TShields("Second_shield"));
//        System.out.println(j1.getShield().getTypeShield());
//        j1.getShield().checkShield("Second_Attack");
//        Inimigo enemy = new Inimigo1Easy();
//        System.out.println(enemy.getAtaque().getAtaques() + " " + enemy.getAtaque().getDanoDeAtaque());
//        enemy.setAtaque(new Fire_Attack(enemy.getAtaque()));
//        System.out.println(enemy.getAtaque().getAtaques() + " " + enemy.getAtaque().getDanoDeAtaque());
//
//        Jogador j1 = new Jogador1();
//        Shield s1 = new TShields("Fire_shield");
//        Shield s2 = new TShields("Wind_shield");
//        j1.setShield(s1);
//        j1.getShield().setNext(s2);
//        System.out.println(j1.getShield().getTypeShield());
//        enemy.confrontar(j1);
//        j1.getShield().checkShield(enemy.getAtaque().getAtaques());
        //System.out.println(j1.getShield().getAllTypeShield());
        //System.out.println(j1.getShield().getTypeShield());
//        Jogador j = new Jogador1();
//        System.out.println(j.getClass());
//        j.alterLife(50);
//        System.out.println(j.getState().getClass());
//        System.out.println(j.getA().getClass());
//        System.out.println(j.getC().getClass());
//        j.alterLife(10);
//
//        System.out.println(j.getState().getClass());
//        System.out.println(j.getA().getClass());
//        System.out.println(j.getC().getClass());
//
//        j.alterLife(80);
//
//        System.out.println(j.getState().getClass());
//        System.out.println(j.getA().getClass());
//        System.out.println(j.getC().getClass());
//
//        j.alterLife(0);
//        System.out.println(j.getState().getClass());
        Nivel n = Easy.getInstancia();
        Jogador j1 = new Jogador1();
        Shield s = new TShields("Fire_Attack");
        Labirinto saida = new Saida();
        Labirinto abismo = new Abismo();

//        Labirinto lab = new F1Sala1(new Saida(), new F1Sala2t(new Abismo(), new F1Sala1(new F1Sala2t(new Abismo(), new Saida()), new Saida())));
        Labirinto lab = new F1Sala1(saida, abismo, j1, n);
        Labirinto lab2 = new F1Sala2t(saida, lab, j1, n);
        Labirinto lab3 = new F1Sala2t(saida, lab2, j1, n);
        lab.action();
    }

}
