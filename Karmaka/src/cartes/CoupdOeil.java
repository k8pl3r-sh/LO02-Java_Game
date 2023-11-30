package cartes;

public class CoupdOeil extends CarteBleue {
	static int compteurInstance = 0;

	public CoupdOeil() {
		super("CoupdOeil", "", 1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
        
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Regardez la main d'un rival; on peut ensuite jouer une autre carte
		
	}
	
	
}
