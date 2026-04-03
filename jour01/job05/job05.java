package jour01.job05;
import java.util.Scanner;

public class job05 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] trois = new int[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Entrez un entier : ");
            trois[i] = keyboard.nextInt();

        }
        int max = 0;
        for (int i = 0; i<3; i++)
        {
            if (trois[i]>max) 
            {
                max = trois[i];
            }
        }
        System.out.println(max);
        keyboard.close();
    }
}
