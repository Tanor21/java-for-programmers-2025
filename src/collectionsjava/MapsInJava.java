package collectionsjava;

/*
    Les Maps (Map) : HashMap, TreeMap
    Une Map stocke des paires clé-valeur (chaque clé est unique).
 */

import java.util.HashMap;
import java.util.Map;

public class MapsInJava {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Omar", 25);
        ages.put("Aly", 30);
        ages.put("Ousmane", 36);

        System.out.println(ages.get("Aly"));  // 30

    }
}
