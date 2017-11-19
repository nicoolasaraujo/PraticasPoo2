/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.util.ArrayList;
import praticas.Jogador;

/**
 *
 * @author Nicolas
 */
public abstract class Fase {

    protected abstract ArrayList<Elemento> factoryMethod();

    public void jogar(Jogador jogador) {
        System.out.println("Vida inicial: " + jogador.getVida());
        ArrayList<Elemento> faseN = factoryMethod();
        for (Elemento x : faseN) {
            x.confrontar(jogador);
            if (jogador.getVida() <= 0) {
                System.out.println("Você morreu!!!");
                return;
            }
        }
        System.out.println("Você Passou de fase!!");
        System.out.println("Vida Final: " + jogador.getVida());
    }

}
