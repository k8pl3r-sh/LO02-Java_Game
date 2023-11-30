package cartes;

public class RevesBrises extends CarteBleue {
	static int compteurInstance = 0;

	public RevesBrises() {
		super("RevesBrises", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Placez la première carte del a vie future d'un rival sur la vôtre
		
	}
	
	
}
