/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.util.ArrayList;
import praticas.*;

/**
 *
 * @author Nicolas
 */
public class Fase1 extends Fase {

    @Override
    public ArrayList<Elemento> factoryMethod() {
        ArrayList<Elemento> fase1 = new ArrayList<Elemento>();
        int count = 0;
        while (count < 4) {
            fase1.add(new Pedra());
            count++;
        }
        while (count < 6) {
            fase1.add(new Buraco());
            count++;
        }
        while (count < 9) {
            fase1.add(new Inimigo1());
            count++;
        }
        return fase1;

    }

}
