package jour01.job10;
import java.util.Scanner;
public class job10 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un entier n : > ");
        int n = keyboard.nextInt();
        int sum_n = 1;
        for (int i = 1; i <= n; i++)
        {
            sum_n *= i;
        }
        System.out.println(sum_n);
    }
}
