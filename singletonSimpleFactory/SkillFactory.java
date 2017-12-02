/*
 * To change this license header, choose License Headers in Pronect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonSimpleFactory;

import decorator.Atacar;
import decorator.DecoradorAtaque;
import poderes.GenkiDama;
import poderes.Kaioken;
import poderes.Kamehameha;
import poderes.SuperSaiyajin;
import poderes.SuperSaiyajin2;

/**
 *
 * @author Nicolas
 *
 * Retorna em tempo de execução uma habilidade para cada nível
 */
public class SkillFactory {

    private static DecoradorAtaque skill = null;

    public static DecoradorAtaque getSkill() {
        return skill;
    }

    public static void setSkill(DecoradorAtaque skill) {
        SkillFactory.skill = skill;
    }

    public static DecoradorAtaque createSkillEasy(Atacar ataque) {
        setSkill(new Kaioken(ataque));

        return getSkill();
    }

    public static DecoradorAtaque createSkillMedium(Atacar ataque) {
        double random = Math.random();
        if (random <= 0.5) {
            setSkill(new Kamehameha(ataque));
        } else if (0.5 < random && random <= 1.0) {
            setSkill(new SuperSaiyajin(ataque));
        }

        return getSkill();

    }

    public static DecoradorAtaque createSkillHard(Atacar ataque) {
        double random = Math.random();

        if (random <= 0.5) {
            setSkill(new SuperSaiyajin2(ataque));
        } else if (0.5 < random && random <= 1.0) {
            setSkill(new GenkiDama(ataque));
        }

        return getSkill();

    }

}
