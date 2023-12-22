package cartes;

import main.TypeCarte;

import java.util.Scanner;

import main.Joueur;
import main.Lieu;
import main.Pouvoirs;

public class Carte {
	private String nom;
	// private String pouvoir;
	private TypeCarte type; //mettre une enum
	private Pouvoirs pouvoir;
	private int point;
	
	public Carte(String nom, Pouvoirs pouvoir, TypeCarte type, int point) {
		this.nom = nom;
		this.pouvoir = pouvoir;
		this.type = type;
		this.point = point;
	}
	
	

	@Override
	public String toString() {
		return "\n---\nCarte '" + nom + "'\nPouvoir : " + pouvoir + "\nType : " + type + "\nPoints de la carte : " + point;
	}



	public static void main(String[] args) {
		System.out.println("test");
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pouvoirs getPouvoir() {
		return this.pouvoir;
	}

	public void setPouvoir(Pouvoirs pouvoir) {
		this.pouvoir = pouvoir;
	}

	public TypeCarte getType() {
		return this.type;
	}

	public void setType(TypeCarte type) {
		this.type = type;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner scanner) {
		this.pouvoir.appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, scanner);
	}
	
}
