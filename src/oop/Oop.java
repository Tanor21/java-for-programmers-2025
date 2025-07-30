package oop;

/*
    Classe & Objet:
        . Une classe est un modèle (ex: Voiture)
        . Un objet est une instance de cette classe
 */

class Calculator {
    int a;

    public int add(int n1, int n2){
        return n1 + n2;
    }
}


public class Oop {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}
