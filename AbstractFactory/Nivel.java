package AbstractFactory;

import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;

public abstract class Nivel {//Abstract Factory

    public abstract Inimigo CreateEnemy();//Product

    public abstract DecoradorAtaque CreateSkill(Atacar ataque);//Product

    public abstract Obstaculo CreateHurdle();//Product

}
