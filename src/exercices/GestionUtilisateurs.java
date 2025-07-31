package exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class GestionUtilisateurs {
    public static void main(String[] args) {

        List<String> nom = new ArrayList<>();
        nom.add("Ousmane");
        nom.add("Aly");
        nom.add("Omar");
        nom.add("Ousmane");
        nom.add("Aly");
        nom.add("Abubakr");
        nom.add("Aly");

        System.out.println(nom);

        TreeSet<String> nomsUniquesTries = new TreeSet<>(nom);

        // Affichage
        System.out.println("Liste sans doublons triée : " + nomsUniquesTries);


    }
}
