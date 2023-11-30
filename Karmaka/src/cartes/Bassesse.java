package cartes;

public class Bassesse extends CarteRouge {
	static int compteurInstance = 0;

	public Bassesse() {
		super("Bassesse", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Défaussez au hasard 2 cartes de la main d'un rival.
		
	}

}
