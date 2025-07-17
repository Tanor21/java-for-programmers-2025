package datatypes;

/*
    Déclare une variable pour chaque type primitif (byte, short, int, long, float, double, char, boolean)
    Donne-leur des valeurs réalistes
    Affiche-les avec System.out.println(...)
 */

public class Exercices {
    public static void main(String[] args) {
        System.out.println("Exercice after understanding the data types");

        byte niveau = 1;
        short hauteur = 12000;
        int num = 9;
        long galaxies = 12000000000L;
        float temperature = 40.7f;
        double pi = 3.14159;
        char genre = 'M';
        boolean tvIsOnMode = false;

        System.out.println("Niveau : " + niveau);
        System.out.println("Hauteur : " + hauteur);
        System.out.println("Numero : " + num);
        System.out.println("Galaxies : " + galaxies);
        System.out.println("Température : " + temperature);
        System.out.println("Pi : " + pi);
        System.out.println("Genre : " + genre);
        System.out.println("La télé est en mode on ? " + tvIsOnMode);

    }
}
