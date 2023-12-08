package cartes;

import test_projet_LO02.TypeCarte;

public abstract class CarteMosaique extends Carte {
	public CarteMosaique(String nom, String pouvoir, int point) {
        super(nom, pouvoir, TypeCarte.MOSAIQUE, point);
    }
	
}