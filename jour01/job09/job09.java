package jour01.job09;
import java.util.Scanner;
public class job09 {

    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez votre age : > ");
        int age = keyboard.nextInt();
        if (age < 18)
        {
            System.out.println("vous etes mineur");
        }
        else
        {
            System.out.println("vous etes majeur");
        }
        keyboard.close();
    }
}

