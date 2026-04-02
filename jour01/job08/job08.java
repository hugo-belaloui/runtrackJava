package jour01.job08;
import java.util.Scanner;

public class job08 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : > ");
        int n = keyboard.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i * i * i;
        }
        System.out.println(sum);
    }
    
}
