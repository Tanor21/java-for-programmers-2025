package collectionsjava;

/*
    En Java, les collections sont des structures de données dynamiques pour stocker et
    manipuler des groupes d’objets (liste, ensemble, dictionnaire...).
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Learn collections in java");

        // 1. Création de la HashMap pour stocker les contacts
        Map<String, String> contacts = new HashMap<>();

        // 2. Ajout des contacts
        contacts.put("Abubakr", "0612345678");
        contacts.put("Omar", "0798765432");
        contacts.put("Aly", "0687654321");
        contacts.put("Ousmane", "0744556677");

        // 3. Affichage NON TRIÉ (ordre d'insertion aléatoire)
        System.out.println("Contacts non triés : " + contacts);

        // 4. Conversion en TreeMap pour tri automatique par clé
        Map<String, String> contactsTries = new TreeMap<>(contacts);

        // 5. Affichage TRIÉ par nom
        System.out.println("\nContacts triés par nom :");
        for (Map.Entry<String, String> entry : contactsTries.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    }
}
