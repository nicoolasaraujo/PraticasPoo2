/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import AbstractFactory.Nivel;
import java.util.Scanner;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public class F1Sala1 extends Sala {

    public F1Sala1(Labirinto x1, Labirinto x2, Jogador player, Nivel n) {
        super(x1, x2, player, n);
        this.setElem(n.CreateEnemy());
    }

    @Override
    public void action() {
        double x = Math.random();
        System.out.println("Você está na sala F1Sala1");
//        Scanner x1 = new Scanner(System.in);

//        x1.nextLine();
        Scanner x1 = new Scanner(System.in);
        x1.nextLine();
        this.getElem().confrontar(this.getPlayer());
        if (x <= 8) {
            getX2().action();
        } else {
            getX1().action();
        }

    }

}
