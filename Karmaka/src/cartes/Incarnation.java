package cartes;

public class Incarnation extends CarteMosaique {
	static int compteurInstance = 0;

	public Incarnation() {
		super("Incarnation", "", 1);
		if (compteurInstance > 4) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Choisissez une de vos Oeuvres. Copiez son pouvoir
		
	}
	
	
}
