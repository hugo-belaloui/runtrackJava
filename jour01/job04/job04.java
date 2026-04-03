package jour01.job04;
import java.util.Scanner;

public class job04 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int square = keyboard.nextInt();
        System.out.println(square*square);
        keyboard.close();
    }
}
