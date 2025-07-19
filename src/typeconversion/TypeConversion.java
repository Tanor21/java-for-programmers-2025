package typeconversion;

/*
    Java permet deux types de conversion de type :
    A. Conversion implicite (automatique)
        Quand Java convertit automatiquement un type plus petit vers un type plus grand.
        NB: Ordre croissant des types :
        byte → short → int → long → float → double
    B. Conversion explicite (cast)
        Quand tu convertis manuellement un type plus grand vers un plus petit (risque de perte de données).
 */

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("Learn type conversion in java");

        // Conversion implicite
        int entier = 42;
        double decimale = entier; // int → double automatiquement

        // Conversion explicite
        double pi = 3.14159;
        int entierPi = (int) pi;  // On perd les décimales

        long grand = 10000000000L;
        int reduit = (int) grand; // Perte possible

        System.out.println("Entier -> Double : " + decimale);
        System.out.println("Double -> Entier : " + entierPi);
        System.out.println("Long -> Int : " + reduit);
    }
}
