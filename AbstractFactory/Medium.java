/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Inimigos.Inimigo1Medium;
import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;
import obstaculos.BuracoMedium;
import poderes.GenkiDamaMedium;

/**
 *
 * @author Nicolas
 */
public class Medium extends Nivel {

    @Override
    public Inimigo CreateEnemy() {
        return new Inimigo1Medium();
    }

    @Override
    public DecoradorAtaque CreateSkill(Atacar ataque) {
        return new GenkiDamaMedium(ataque);
    }

    @Override
    public Obstaculo CreateHurdle() {
        return new BuracoMedium();
    }

}
