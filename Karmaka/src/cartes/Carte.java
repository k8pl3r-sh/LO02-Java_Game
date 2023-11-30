package cartes;

import test_projet_LO02.TypeCarte;

public abstract class Carte {
	private String nom;
	private String pouvoir;
	private TypeCarte type; //mettre une enum
	private int point;
	
	public Carte(String nom, String pouvoir, TypeCarte type, int point) {
		this.nom = nom;
		this.pouvoir = pouvoir;
		this.type = type;
		this.point = point;
	}
	
	

	@Override
	public String toString() {
		return "\nCarte [nom=" + nom + ", pouvoir=" + pouvoir + ", type=" + type + ", point=" + point + "]";
	}



	public static void main(String[] args) {
		System.out.println("test");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPouvoir() {
		return pouvoir;
	}

	public void setPouvoir(String pouvoir) {
		this.pouvoir = pouvoir;
	}

	public TypeCarte getType() {
		return type;
	}

	public void setType(TypeCarte type) {
		this.type = type;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public abstract void appliquerPouvoir();
}
