package exercices;

import java.util.Scanner;

public class BonjourUtilisateur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1. Demander le nom
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // 2. Demander l'âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // 3. Affichage du message
        System.out.println("Bonjour " + nom + ", tu as " + age + " ans.");

        // 4. Majeur ou mineur
        if (age >= 18) {
            System.out.println("Tu es majeur.");
        } else {
            System.out.println("Tu es mineur.");
        }

        // Bonne pratique : fermer le scanner
        scanner.close();

    }
}
