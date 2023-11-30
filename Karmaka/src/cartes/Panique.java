package cartes;

public class Panique extends CarteRouge {
	static int compteurInstance = 0;

	public Panique() {
		super("Panique", "", 1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Défaussez la première carte de la Pile d'un joueur. Vous pouvez ensuite jouer une autre carte.
		
	}
	

}
