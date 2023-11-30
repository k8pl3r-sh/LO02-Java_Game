package cartes;

public class Destinee extends CarteBleue {
	static int compteurInstance = 0;

	public Destinee() {
		super("Destinee", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Regarder les 3 premieres cartes de la source; ajoutez en jusqu'à 2 à votre vie future.
		// Replacer le reste dans l'ordre souhaité
		
	}
	
	
}
