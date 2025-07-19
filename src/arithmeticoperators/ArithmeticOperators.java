package arithmeticoperators;

/*
    Les operateurs arithmetique
        Ce sont des symboles utilisés pour effectuer des opérations mathématiques sur des variables ou des valeurs.
        Liste des operateurs arithmetiques en java:

            | Opérateur | Description    | Exemple | Résultat |
            | --------- | -------------- | ------- | -------- |
            | `+`       | Addition       | `5 + 2` | `7`      |
            | `-`       | Soustraction   | `5 - 2` | `3`      |
            | `*`       | Multiplication | `5 * 2` | `10`     |
            | `/`       | Division       | `5 / 2` | `2`      |
            | `%`       | Modulo (reste) | `5 % 2` | `1`      |

 */


public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Learn arithmetic operators in java");

        int a = 10;
        int b = 3;

        System.out.println("Addition : " + (a + b));
        System.out.println("Soustraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division entière : " + (a / b));
        System.out.println("Modulo : " + (a % b));

    }
}
