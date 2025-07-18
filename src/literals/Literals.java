package literals;

/*
    Un literal est une valeur directement écrite dans le code, affectée à une variable.
 */

public class Literals {
    public static void main(String[] args) {
        System.out.println("Learn literals in java");

        int age = 25;            // 25 est un literal entier
        double pi = 3.14;        // 3.14 est un literal décimal
        boolean actif = true;    // true est un literal booléen
        char lettre = 'A';       // 'A' est un literal caractère
        String nom = "Tanor";    // "Tanor" est un literal String (objet)

        int decimal = 25;
        int binaire = 0b11001;
        int octal = 031;
        int hexa = 0x19;

        float temperature = 36.5f;

        char unicode = '\u004A'; // J


        System.out.println("Decimal : " + decimal);
        System.out.println("Binaire : " + binaire);
        System.out.println("Octal : " + octal);
        System.out.println("Hexa : " + hexa);
        System.out.println("Float : " + temperature);
        System.out.println("Double : " + pi);
        System.out.println("Char : " + lettre + ", Unicode : " + unicode);
        System.out.println("Booléen : " + actif);
        System.out.println("String : " + nom);



    }
}
