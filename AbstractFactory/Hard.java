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
import singletonSimpleFactory.EnemyFactory;
import singletonSimpleFactory.HurdleFactory;
import singletonSimpleFactory.SkillFactory;

/**
 *
 * @author Nicolas
 */
public class Hard extends Nivel {

    private static Hard instancia = null;

    private Hard() {

    }

    public static synchronized Nivel getInstancia() {
        if (instancia == null) {
            instancia = new Hard();
        }
        return instancia;
    }

    @Override
    public Inimigo CreateEnemy() {
        return EnemyFactory.createInimigoHard();
    }

    @Override
    public DecoradorAtaque CreateSkill(Atacar ataque) {
        return SkillFactory.createSkillHard(ataque);
    }

    @Override
    public Obstaculo CreateHurdle() {
        return HurdleFactory.createHurdleHard();
    }

}
