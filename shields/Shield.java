/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shields;

/**
 *
 * @author Nicolas
 */
public abstract class Shield {

    private Shield next = null;

    private String typeShield = null;

    public Shield(String typeShield) {
        this.typeShield = typeShield;

    }

    public String getTypeShield() {//Retorna somente o primeiro escudo da cadeia

        return this.typeShield;
    }

    public String getAllTypeShield() {//Retorna todos os tipos de escudo da cadeia
        if (getNext() != null) {
            while (getNext() != null) {
                return this.typeShield + " " + next.typeShield;
            }

        }

        return this.typeShield;

    }

    public void setTypeShield(String typeShield) {
        this.typeShield = typeShield;
    }

    public void setNext(Shield next) {

//        if (this.next == null) {
//            System.out.println("here");
        this.next = next;
//        } else {
//            System.out.println("Not here");
//            this.next.setNext(next);
//        }

    }

    public Shield getNext() {
        return this.next;
    }

    public abstract boolean checkShield(String attack);

}
