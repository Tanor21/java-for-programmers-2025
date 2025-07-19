package typeconversion;


/*
    Exercice 1:
        Fais une conversion implicite de int → float → double
        Fais une conversion explicite de double → int, long → short, float → byte
        Teste un dépassement
 */

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Exercice after understanding the type conversions");

        // ✅ Conversion implicite (automatique)
        int entier = 100;
        float reel1 = entier;       // int → float
        double reel2 = reel1;       // float → double

        System.out.println("int vers float : " + reel1);
        System.out.println("float vers double : " + reel2);

        // ✅ Conversion explicite (cast)
        double pi = 3.14159;
        int entierPi = (int) pi;  // Perd la partie décimale (3)
        System.out.println("double vers int : " + entierPi);

        long grandNombre = 100000L;
        short petitNombre = (short) grandNombre;  // OK ici car 100000 < 32767
        System.out.println("long vers short : " + petitNombre);

        float reel3 = 123.45f;
        byte mini = (byte) reel3;   // Partie entière uniquement, possible perte
        System.out.println("float vers byte : " + mini);

    }
}
