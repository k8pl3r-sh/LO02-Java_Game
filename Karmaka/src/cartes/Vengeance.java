package cartes;

public class Vengeance extends CarteRouge {
	static int compteurInstance = 0;

	public Vengeance() {
		super("Vengeance", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Défaussez l'Oeuvre Exposée d'un rival.
		
	}

}
