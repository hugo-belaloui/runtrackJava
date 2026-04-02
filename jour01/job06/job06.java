package jour01.job06;
import java.util.Scanner;

public class job06 {
    public static void main(String[] args)
    {
        // Variable 1: Le Scanner pour lire l'entrée utilisateur.
        Scanner keyboard = new Scanner(System.in);

        // Variable 2: Une variable pour accumuler la somme puis stocker la moyenne.
        double resultat = 0;

        System.out.println("Veuillez taper cinq entiers :");

        System.out.print("Entier 1: ");
        resultat += keyboard.nextInt();
        System.out.print("Entier 2: ");
        resultat += keyboard.nextInt();
        System.out.print("Entier 3: ");
        resultat += keyboard.nextInt();
        System.out.print("Entier 4: ");
        resultat += keyboard.nextInt();
        System.out.print("Entier 5: ");
        resultat += keyboard.nextInt();

        System.out.println("\nLa moyenne de ces cinq entiers est : " + (resultat / 5.0));

        keyboard.close();
    }
}