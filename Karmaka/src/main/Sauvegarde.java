package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import main.Joueur;


/**
 * La classe {@code Sauvegarde} gère la sérialisation et la désérialisation d'objets.
 * 
 * Note : Le code actuel est non fonctionnel et nécessite des modifications pour une utilisation correcte. 
 * Les méthodes de la classes n'ont pas pu être testées.
 */
public class Sauvegarde implements Serializable {

	/**
     * Sérialise un objet et écrit le résultat dans un fichier.
     *
     * @param obj      L'objet à sérialiser.
     * @param filePath Le chemin du fichier dans lequel écrire l'objet sérialisé.
     */
	public static void serializeObject(Sauvegarde obj, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
            System.out.println("Sérialisation OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	/**
     * Désérialise un objet depuis un fichier.
     *
     * @param filePath Le chemin du fichier depuis lequel désérialiser l'objet.
     * @return L'objet désérialisé.
     */
    public static Sauvegarde deserializeObject(String filePath) {
    	Sauvegarde obj = null;
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            obj = (Sauvegarde) objectIn.readObject();
            System.out.println("Déserialisation OK");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    /**
     * Sérialise une liste d'objets et écrit le résultat dans un fichier.
     *
     * @param objects  La liste d'objets à sérialiser.
     * @param filePath Le chemin du fichier dans lequel écrire les objets sérialisés.
     */
    public static void serializeObjects(List<Object> objects, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            for (Object obj : objects) {
                objectOut.writeObject(obj);
            }
            System.out.println("Sérialisation OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Désérialise une liste d'objets depuis un fichier.
     *
     * @param filePath Le chemin du fichier depuis lequel désérialiser les objets.
     * @return La liste d'objets désérialisés.
     */
    public static List<Joueur> deserializeObjects(String filePath) {
        List<Joueur> objects = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            while (fileIn.available() > 0) {
            	// Le code ci-dessous est non fonctionnel et nécessite des modifications.
                Object obj = objectIn.readObject();
                
            }
            System.out.println("Déserialisation OK");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
	
	
	
	
}
