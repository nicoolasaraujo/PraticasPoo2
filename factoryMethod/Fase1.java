/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import AbstractFactory.Nivel;
import obstaculos.PedraMedium;
import obstaculos.BuracoMedium;
import Inimigos.Inimigo1Easy;
import java.util.ArrayList;
import praticas.*;

/**
 *
 * @author Nicolas
 */
public class Fase1 extends Fase {

    @Override
    public ArrayList<Elemento> factoryMethod(Nivel n) {
        ArrayList<Elemento> fase1 = new ArrayList<Elemento>();
        int count = 0;
        while (count < 4) {
            fase1.add(new PedraMedium());
            count++;
        }
        while (count < 6) {
            fase1.add(new BuracoMedium());
            count++;
        }
        while (count < 9) {
            fase1.add(n.CreateEnemy());
            count++;
        }
        return fase1;

    }

}
