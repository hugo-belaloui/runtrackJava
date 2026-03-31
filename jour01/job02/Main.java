package jour01.job02;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("quel est votre prénom ? > ");
        String prenom = keyboard.nextLine();
        System.out.println("Bonjour " + prenom);
        keyboard.close();
        
    }
}