package uqac.dim.personnage;

public class Mage extends Personnage {
    private int pm;

    public Mage(){

        super("Mage", Alignement.BON, "Endymion le maitre des magies", 3, 5, 7);
        pm = 5;
    }

    public final int getPM(){

        return pm;
    }

    public final void setPM(int pm){

        this.pm = validerValeur(pm);
    }
}
