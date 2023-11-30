package cartes;

public class DernierSouffle extends CarteRouge {
	static int compteurInstance = 0;

	public DernierSouffle() {
		super("DernierSouffle", "", 1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		//Le joueur de votre choix défausse une carte de sa Main.
	}

}
