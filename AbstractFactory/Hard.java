/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Inimigos.Inimigo1Hard;
import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;
import obstaculos.BuracoHard;
import poderes.GenkiDamaHard;

/**
 *
 * @author Nicolas
 */
public class Hard extends Nivel {

    @Override
    public Inimigo CreateEnemy() {
        return new Inimigo1Hard();
    }

    @Override
    public DecoradorAtaque CreateSkill(Atacar ataque) {
        return new GenkiDamaHard(ataque);
    }

    @Override
    public Obstaculo CreateHurdle() {
        return new BuracoHard();
    }

}
