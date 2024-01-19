package cartes;

import main.TypeCarte;

import java.util.Scanner;

import main.Joueur;
import main.Lieu;
import main.Pouvoirs;

/**
 * La classe {@code Carte} représente une carte avec un nom, un pouvoir, un type, et un nombre de points.
 * Les instances de cette classe seront utilisées dans la partie.
 */
public class Carte {
	private String nom;
	private TypeCarte type;
	private Pouvoirs pouvoir;
	private int point;
	
	/**
     * Constructeur pour créer une instance de la classe Carte.
     *
     * @param nom     Le nom de la carte.
     * @param pouvoir Le pouvoir associé à la carte.
     * @param type    Le type de la carte.
     * @param point   Le nombre de points attribués à la carte.
     */
	public Carte(String nom, Pouvoirs pouvoir, TypeCarte type, int point) {
		this.nom = nom;
		this.pouvoir = pouvoir;
		this.type = type;
		this.point = point;
	}
	
	
	/**
     * Renvoie une représentation textuelle de la carte.
     *
     * @return Une chaîne de caractères représentant la carte.
     */
	@Override
	public String toString() {
		return "\n---\nCarte '" + nom + "'\nPouvoir : " + pouvoir + "\nType : " + type + "\nPoints de la carte : " + point;
	}

	/**
	 * Renvoie le nom de la carte.
	 *
	 * @return Le nom de la carte.
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Modifie le nom de la carte.
	 *
	 * @param nom Le nouveau nom de la carte.
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Renvoie le pouvoir associé à la carte.
	 *
	 * @return Le pouvoir associé à la carte.
	 */
	public Pouvoirs getPouvoir() {
		return this.pouvoir;
	}

	/**
	 * Modifie le pouvoir associé à la carte.
	 *
	 * @param pouvoir Le nouveau pouvoir associé à la carte.
	 */
	public void setPouvoir(Pouvoirs pouvoir) {
		this.pouvoir = pouvoir;
	}

	/**
	 * Renvoie le type de la carte.
	 *
	 * @return Le type de la carte.
	 */
	public TypeCarte getType() {
		return this.type;
	}

	/**
	 * Modifie le type de la carte.
	 *
	 * @param type Le nouveau type de la carte.
	 */
	public void setType(TypeCarte type) {
		this.type = type;
	}

	/**
	 * Renvoie le nombre de points de la carte.
	 *
	 * @return Le nombre de points de la carte.
	 */
	public int getPoint() {
		return this.point;
	}

	/**
	 * Modifie le nombre de points de la carte.
	 *
	 * @param point Le nouveau nombre de points de la carte.
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	
	/**
     * Applique le pouvoir de la carte sur les joueurs et les lieux spécifiés.
     *
     * @param joueur       Le joueur qui utilise la carte.
     * @param adversaire   Le joueur adverse.
     * @param source       Le lieu source.
     * @param fosse        Le lieu de la fosse.
     * @param coutKarmique Le lieu du coût karmique.
     * @param scanner      Objet Scanner pour l'interaction utilisateur.
     */
	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner scanner) {
		this.pouvoir.appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, scanner);
	}
	
}
