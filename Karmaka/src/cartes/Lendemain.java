package cartes;

public class Lendemain extends CarteVerte {
	static int compteurInstance = 0;

	public Lendemain() {
		super("Lendemain", "", 1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Puisez une carte à la Source. Vous pouvez ensuite jouer une autre carte.
		
	}
	

}
