package cartes;

public class Jubile extends CarteVerte {
	static int compteurInstance = 0;

	public Jubile() {
		super("Jubile", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Places jusqu'à 2 Cartes de votre main sur vos Oeuvres
		
	}
	
	
}
