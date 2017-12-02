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
import factoryMethod.Obstaculo;
import obstaculos.BarreiraDaMorteEasy;
import obstaculos.BarreiraDaMorteHard;
import obstaculos.BarreiraDaMorteMedium;
import obstaculos.BuracoEasy;
import obstaculos.BuracoHard;
import obstaculos.BuracoMedium;
import obstaculos.PedraEasy;
import obstaculos.PedraHard;
import obstaculos.PedraMedium;

/**
 *
 * @author Nicolas
 */
public class HurdleFactory {

    private static Obstaculo hurdle = null;

    public static Obstaculo getHurdle() {
        return hurdle;
    }

    public static void setHurdle(Obstaculo hurdle) {
        HurdleFactory.hurdle = hurdle;
    }

    public static Obstaculo createHurdleEasy() {

        double random = Math.random();

        if (random <= 0.2) {
            setHurdle(new BarreiraDaMorteEasy());
        } else if (0.2 < random && random <= 0.4) {
            setHurdle(new BuracoEasy());
        } else if (0.4 < random && random <= 0.6) {
            setHurdle(new PedraEasy());
        }
        return getHurdle();
    }

    public static Obstaculo createHurdleMedium() {
        double random = Math.random();
        if (random <= 0.2) {
            setHurdle(new BarreiraDaMorteMedium());
        } else if (0.2 < random && random <= 0.4) {
            setHurdle(new BuracoMedium());
        } else if (0.4 < random && random <= 0.6) {
            setHurdle(new PedraMedium());
        }

        return getHurdle();

    }

    public static Obstaculo createHurdleHard() {
        double random = Math.random();

        if (random <= 0.2) {
            setHurdle(new BarreiraDaMorteHard());
        } else if (0.2 < random && random <= 0.4) {
            setHurdle(new BuracoHard());
        } else if (0.4 < random && random <= 0.6) {
            setHurdle(new PedraHard());
        }

        return getHurdle();

    }

}
