package exercices;

class Voiture {
    private String marque;
    private int année;
    private int vitesse;

    public Voiture(String marque, int année, int vitesse) {
        this.marque = marque;
        this.année = année;
        this.vitesse = vitesse;
    }

    public void accelerer(int kmh){
        this.vitesse += kmh;
    }

    public void afficherInfo(){
        System.out.println(marque + " - " + année + " - " + vitesse + " km/h");
    }

}


class VoitureElectrique extends Voiture {
    private int autonomie;

    public VoitureElectrique(String marque, int année, int vitesse, int autonomie) {
        super(marque, année, vitesse); // Appel au constructeur de Voiture
        this.autonomie = autonomie;
    }

    @Override
    public void afficherInfo() {
        // On appelle la méthode de la classe mère d'abord (optionnel)
        super.afficherInfo();
        // Puis on affiche l'autonomie en plus
        System.out.println("Autonomie : " + autonomie + " km");
    }
}



public class Car {
    public static void main(String[] args) {

        Voiture v1 = new Voiture("Toyota", 2020, 100);
        Voiture v2 = new Voiture("BMW", 2025, 18);

        v1.accelerer(20); // Résultat attendu : 120 km/h
        v2.accelerer(15); // Résultat attendu : 33 km/h

        v1.afficherInfo();
        v2.afficherInfo();

        // Voiture électrique
        VoitureElectrique tesla = new VoitureElectrique("Tesla", 2023, 90, 450);
        tesla.accelerer(10);  // La vitesse passe a 100
        tesla.afficherInfo();

    }
}
