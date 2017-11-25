package shields;

/**
 *
 * @author Nicolas
 */
public class TShields extends Shield {

    public TShields(String typeShield) {
        super(typeShield);
    }

    @Override
    public boolean checkShield(String attack) {
        if (!this.getTypeShield().split("_")[0].contains(attack.split("_")[0])) {//Verifica se o persinagem possui o escudo
            
            if (getNext() != null) {//Se o ele não possuir e o proximo na cadeio for diferente de null
                getNext().checkShield(attack);//Verifica se o proximo pode conter o ataque
            } else {//Se o proximo for null, então o personagem nn possui escudo para o ataque

                return false;
            }
        } else {// Se o escudo for encontrado, retorna verdadeiro
//            System.out.println("HA! Seus ataque não prevaleceram porque eu uso o: " + getTypeShield().split(" ")[0]);
            return true;

        }
        return true;

    }

}
