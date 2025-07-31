package collectionsjava;


/*
    Les Ensembles (Set) : HashSet, TreeSet
    Un Set est une collection non ordonnée qui interdit les doublons.
 */

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Mangue");
        fruits.add("Raisins");
        fruits.add("Pomme");  // Ignoré (déjà présent)

        System.out.println(fruits); // [Pomme, Banane]

    }
}
