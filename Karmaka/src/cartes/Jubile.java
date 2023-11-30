package cartes;

public class Jubile extends CarteVerte {
	static int compteurInstance = 0;

	private Jubile(String nom, String pouvoir, int point) {
		super(nom, pouvoir, point);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		
	}
	
	
}
