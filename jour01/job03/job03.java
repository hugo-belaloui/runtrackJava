package jour01.job03;

public class job03 {
    public static void main(String[] args)
    {
        int[] T = new int[10];
        for (int i = 0; i<10; i++)
        {
            T[i]=i;
        }
        System.out.println(T[0]);
        System.out.println(T[1]);
        System.out.println(T[5]);
        System.out.println(T[9]);
        System.out.println(T[10]); // index error
    }
}
