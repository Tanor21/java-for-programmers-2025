package variables;

/*
 * Exercice 1 : Crée un programme qui déclare les variables suivantes :
 *
 *     String prenom
 *
 *     int anneeNaissance
 *
 *     int anneeActuelle
 *
 *     Calcule et affiche l’âge avec : age = anneeActuelle - anneeNaissance
 */

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Exercice after understanding the variables");

        String prenom = "Tanor";
        int anneeNaissance = 2000;
        int anneeActuelle = 2025;
        int age = anneeActuelle - anneeNaissance;

        boolean aimeJava = true;
        char niveau = 'A';
        System.out.println("Je m'appelle " + prenom + ".");
        System.out.println("J'ai " + age + " ans.");
        System.out.println("J'aime Java : " + aimeJava);
        System.out.println("Niveau : " + niveau);
    }
}
