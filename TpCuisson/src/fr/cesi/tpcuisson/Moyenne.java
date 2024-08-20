package fr.cesi.tpcuisson;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Entrez le premier nombre: ");
        int nombre1 = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre: ");
        int nombre2 = scanner.nextInt();

        // Utiliser la fonction pour calculer et afficher la moyenne
        double moyenne = calculerMoyenne(nombre1, nombre2);
        System.out.println("La moyenne est: " + moyenne);

        // Utiliser la procédure pour afficher la comparaison
        afficherComparaison(nombre1, nombre2);
    }

    // Fonction pour calculer la moyenne
    public static double calculerMoyenne(int a, int b) {
        return (a + b) / 2.0;
    }

    // Procédure pour afficher la comparaison
    public static void afficherComparaison(int a, int b) {
        if (a > b) {
            System.out.println(a + " est plus grand que " + b);
        } else if (a < b) {
            System.out.println(b + " est plus grand que " + a);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }
    }
}
