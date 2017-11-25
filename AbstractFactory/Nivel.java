package AbstractFactory;

import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;

public abstract class Nivel {


    public abstract Inimigo CreateEnemy();

    public abstract DecoradorAtaque CreateSkill(Atacar ataque);

    public abstract Obstaculo CreateHurdle();

}
