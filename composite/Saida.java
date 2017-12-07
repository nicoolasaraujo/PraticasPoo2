/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Nicolas
 */
public class Saida implements Labirinto {

    private String desc = "Saida";

    public String getDesc() {
        return desc;
    }

    public void setDesc() {
        this.desc = "Saida";
    }

    @Override
    public void action() {
        System.out.println(getDesc());
    }

}
