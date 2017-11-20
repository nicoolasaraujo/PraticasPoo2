package AbstractFactory;

import decorator.DecoradorAtaque;
import factoryMethod.Obstaculo;
import Inimigos.Inimigo;
import decorator.Atacar;

public abstract class Nivel {

    private static Nivel instancia = null;

    protected Nivel() {
        super();
    }

    public static synchronized Nivel getInstancia(Nivel n) {
        if (instancia == null) {
            instancia = n;
        }
        return instancia;
    }

    public abstract Inimigo CreateEnemy();

    public abstract DecoradorAtaque CreateSkill(Atacar ataque);

    public abstract Obstaculo CreateHurdle();

}
