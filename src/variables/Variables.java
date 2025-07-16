package variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Learn variables in java");
        /*
          Une variable est un espace dans la memoire qui contient une valeur. Ella a:
          un type (ex: int, String, float, double, boolean, char, etc.)
          un nom (ex: age, nom, solde etc.),
          Une valeur (ex: 25, "Tanor" etc.)
         */

        // Exemple :
        String nom = "Tanor";
        int age = 30;
        double taille = 1.90;
        boolean estIngenieur = true;
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age + " ans");
        System.out.println("Taille : " + taille + " m");
        System.out.println("Est ingénieur ? " + estIngenieur);
    }
}
