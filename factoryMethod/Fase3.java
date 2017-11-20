/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import obstaculos.PedraMedium;
import obstaculos.BuracoMedium;
import java.util.ArrayList;
import Inimigos.Inimigo1;
import Inimigos.Inimigo3;
import Inimigos.Inimigo3Medium;

/**
 *
 * @author Nicolas
 */
public class Fase3 extends Fase {

    @Override
    public ArrayList<Elemento> factoryMethod() {
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
            fase1.add(new Inimigo3Medium());
            count++;

        }
        return fase1;

    }
}
