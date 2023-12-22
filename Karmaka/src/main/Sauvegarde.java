package main;

import java.io.*;
import main.Joueur;


public class Sauvegarde implements Serializable { // à tester 

	public static void serializeObject(Sauvegarde obj, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
            System.out.println("Sérialisation OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
    
    public static List<Joueur> deserializeObjects(String filePath) {
        List<Joueur> objects = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            while (fileIn.available() > 0) {
                Object obj = objectIn.readObject();
                objects.add(obj);
            }
            System.out.println("Déserialisation OK");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
	
	
	
	
}
