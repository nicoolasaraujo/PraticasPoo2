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
import poderes.GenkiDama;
import singletonSimpleFactory.EnemyFactory;
import singletonSimpleFactory.HurdleFactory;
import singletonSimpleFactory.SkillFactory;

/**
 *
 * @author Nicolas
 */
public class Medium extends Nivel {

    private static Medium instancia = null;

    private Medium() {

    }

    public static synchronized Nivel getInstancia() {
        if (instancia == null) {
            instancia = new Medium();
        }
        return instancia;
    }

    @Override
    public Inimigo CreateEnemy() {
        return EnemyFactory.createInimigoMedium();
    }

    @Override
    public DecoradorAtaque CreateSkill(Atacar ataque) {
        return SkillFactory.createSkillHard(ataque);
    }

    @Override
    public Obstaculo CreateHurdle() {
        return HurdleFactory.createHurdleMedium();
    }

}
