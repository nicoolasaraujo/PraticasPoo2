/*
 * To change this license header, choose License Headers in Pronect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonSimpleFactory;

import Inimigos.Inimigo;
import Inimigos.Inimigo1Easy;
import Inimigos.Inimigo1Hard;
import Inimigos.Inimigo1Medium;
import Inimigos.Inimigo2Easy;
import Inimigos.Inimigo2Hard;
import Inimigos.Inimigo2Medium;
import Inimigos.Inimigo3Easy;
import Inimigos.Inimigo3Hard;
import Inimigos.Inimigo3Medium;

/**
 *
 * @author Nicolas
 */
public class EnemyFactory {

    private static Inimigo enemy = null;

    public static Inimigo getEnemy() {
        return enemy;
    }

    public static void setEnemy(Inimigo enemy) {
        EnemyFactory.enemy = enemy;
    }

    public static Inimigo createInimigoEasy() {

        double random = Math.random();

        if (random <= 0.2) {
            setEnemy(new Inimigo1Easy());
        } else if (0.2 < random && random <= 0.4) {
            setEnemy(new Inimigo2Easy());
        } else if (0.4 < random && random <= 0.6) {
            setEnemy(new Inimigo3Easy());
        }
        return getEnemy();
    }

    public static Inimigo createInimigoMedium() {
        double random = Math.random();
        if (random <= 0.2) {
            setEnemy(new Inimigo1Medium());
        } else if (0.2 < random && random <= 0.4) {
            setEnemy(new Inimigo2Medium());
        } else if (0.4 < random && random <= 0.6) {
            setEnemy(new Inimigo3Medium());
        }

        return getEnemy();

    }

    public static Inimigo createInimigoHard() {
        double random = Math.random();

        if (random <= 0.2) {
            setEnemy(new Inimigo1Hard());
        } else if (0.2 < random && random <= 0.4) {
            setEnemy(new Inimigo2Hard());
        } else if (0.4 < random && random <= 0.6) {
            setEnemy(new Inimigo3Hard());
        }

        return getEnemy();

    }

}
