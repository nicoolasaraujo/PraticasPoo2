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
public class Fase2 extends Fase {

    @Override
    public ArrayList<Elemento> factoryMethod() {
        ArrayList<Elemento> fase = new ArrayList<Elemento>();
        int count = 0;
        while (count < 4) {
            fase.add(new BarreiraDaMorte());
            count++;
        }
        while (count < 6) {
            fase.add(new Buraco());
            count++;
        }
        while (count < 9) {
            fase.add(new Inimigo2());
            count++;
        }
        return fase;

    }

}
