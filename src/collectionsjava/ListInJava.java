package collectionsjava;

/*
    Les Listes (List) : ArrayList, LinkedList
    Une List est une collection ordonnée qui autorise les doublons.
 */

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {
        List<String> nom = new ArrayList<>();
        nom.add("Omar");
        nom.add("Ousmane");
        nom.add("Aly");
        nom.add("Abubakr");
        nom.add("Omar");   // doublon accepté

        System.out.println(nom);
        System.out.println(nom.get(1));
    }

}
