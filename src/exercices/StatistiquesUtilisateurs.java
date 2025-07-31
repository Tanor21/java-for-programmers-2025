package exercices;

import java.lang.reflect.Array;
import java.util.*;

public class StatistiquesUtilisateurs {
    public static void main(String[] args) {

        List<String> utilisateurs = Arrays.asList("Aliou", "Fatou", "Aliou", "Tanor", "Fatou", "Aliou", "Awa");

        System.out.println("Liste d’origine : " + utilisateurs);

        // 1. Supprimer les doublons et trier
        Set<String> uniques = new TreeSet<>(utilisateurs);
        System.out.println("\nNoms uniques : " + uniques);

        // 2. Compter les occurrences
        Map<String, Integer> stats = new TreeMap<>();
        for (String nom : utilisateurs) {
            stats.put(nom, stats.getOrDefault(nom, 0) + 1);
        }

        // 3. Afficher les statistiques
        System.out.println("\nOccurrences :");
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    }
}
