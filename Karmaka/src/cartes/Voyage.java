package cartes;

public class Voyage extends CarteVerte {
	static int compteurInstance = 0;

	public Voyage() {
		super("Voyage", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Puisez 3 Cartes à la Source. Vous pouvez ensuite jouer une autre carte.
		
	}
	

}
