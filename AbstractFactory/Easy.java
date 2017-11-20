/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Inimigos.Inimigo1Easy;
import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;
import obstaculos.BuracoEasy;
import poderes.GenkiDamaEasy;

/**
 *
 * @author Nicolas
 */
public class Easy extends Nivel {

    @Override
    public Inimigo CreateEnemy() {
        return new Inimigo1Easy();
    }

    @Override
    public DecoradorAtaque CreateSkill(Atacar ataque) {
        return new GenkiDamaEasy(ataque);
    }

    @Override
    public Obstaculo CreateHurdle() {
        return new BuracoEasy();
    }

}
