/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import AbstractFactory.Nivel;
import obstaculos.BuracoMedium;
import obstaculos.BarreiraDaMorteMedium;
import Inimigos.Inimigo2;
import Inimigos.Inimigo2Easy;
import java.util.ArrayList;
import praticas.*;

/**
 *
 * @author Nicolas
 */
public class Fase2 extends Fase {

    @Override
    public ArrayList<Elemento> factoryMethod(Nivel n) {
        ArrayList<Elemento> fase = new ArrayList<Elemento>();
        int count = 0;
        while (count < 4) {
            fase.add(new BarreiraDaMorteMedium());
            count++;
        }
        while (count < 6) {
            fase.add(new BuracoMedium());
            count++;
        }
        while (count < 9) {
            fase.add(n.CreateEnemy());
            count++;
        }
        return fase;

    }

}
