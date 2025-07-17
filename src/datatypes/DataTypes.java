package datatypes;



/*
    Java a 8 types de données primitifs, regroupés comme ceci :
    | Catégorie        | Type      | Taille   | Exemple                      |
    | ---------------- | --------- | -------- | ---------------------------- |
    | Nombres entiers  | `byte`    | 1 octet  | `byte age = 25;`             |
    |                  | `short`   | 2 octets | `short distance = 300;`      |
    |                  | `int`     | 4 octets | `int population = 16000000;` |
    |                  | `long`    | 8 octets | `long stars = 9000000000L;`  |
    | Nombres décimaux | `float`   | 4 octets | `float price = 19.99f;`      |
    |                  | `double`  | 8 octets | `double pi = 3.1415926535;`  |
    | Caractère        | `char`    | 2 octets | `char initiale = 'T';`       |
    | Booléen          | `boolean` | 1 bit    | `boolean actif = true;`      |
*/


public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Learn data types in java");

        byte niveau = 4;
        short altitude = 12345;
        int populationSenegal = 17000000;
        long etoiles = 9000000000L;

        float temperature = 36.6f;
        double pi = 3.14159;

        char genre = 'M';
        boolean estEtudiant = true;

        System.out.println("Niveau : " + niveau);
        System.out.println("Altitude : " + altitude);
        System.out.println("Population : " + populationSenegal);
        System.out.println("Étoiles visibles : " + etoiles);
        System.out.println("Température : " + temperature);
        System.out.println("Pi : " + pi);
        System.out.println("Genre : " + genre);
        System.out.println("Est étudiant ? " + estEtudiant);

        System.out.println();
    }
}
