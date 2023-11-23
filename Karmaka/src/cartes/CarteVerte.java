package cartes;

import test_projet_LO02.TypeCarte;

public abstract class CarteVerte extends Carte {
	public CarteVerte(String nom, String pouvoir, int point) {
        super(nom, pouvoir, TypeCarte.VERT, point);
    }
	
	public abstract void appliquerPouvoir();
}
