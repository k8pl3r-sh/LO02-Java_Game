package cartes;

import test_projet_LO02.TypeCarte;

public abstract class CarteBleue extends Carte {
	public CarteBleue(String nom, String pouvoir, int point) {
        super(nom, pouvoir, TypeCarte.BLEU, point);
    }
	
}