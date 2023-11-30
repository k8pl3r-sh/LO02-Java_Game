package cartes;

public class Fournaise extends CarteRouge {
	static int compteurInstance = 0;

	public Fournaise() {
		super("Fournaise", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Défaussez les 2 premières cartes de la Vie Future d'un rival
		
	}

}
