package exercices;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire le nombre (Scanner)
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        // Appeler la méthode afficherTable(n)
        afficherTable(nombre);

        // Bonne pratique : fermer le scanner
        scanner.close();
    }

    // Méthode pour afficher la table de multiplication
    public static void afficherTable(int n) {
        System.out.println("Voici la table de " + n + " :");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
