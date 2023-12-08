package cartes;

public class Longevite extends CarteVerte {
	static int compteurInstance = 0;

	public Longevite() {
		super("Longevite", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Places 2 cartes puisées à la Source sur la Pile d'un Joueur.
		
	}
	

}
