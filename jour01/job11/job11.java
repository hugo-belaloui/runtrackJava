package jour01.job11;
import java.util.Scanner;

public class job11 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un entier : > ");
        int n = keyboard.nextInt();
        for (int i = 0; i <= n; i ++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        keyboard.close();
    }
}
