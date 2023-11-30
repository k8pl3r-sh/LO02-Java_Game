package cartes;

import test_projet_LO02.TypeCarte;

public abstract class CarteRouge extends Carte {
	public CarteRouge(String nom, String pouvoir, int point) {
        super(nom, pouvoir, TypeCarte.ROUGE, point);
    }
	
}