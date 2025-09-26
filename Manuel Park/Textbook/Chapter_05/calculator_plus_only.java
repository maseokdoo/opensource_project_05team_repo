package Chapter_05;
import java.util.Scanner;

public class calculator_plus_only
{
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        int z = i + j;
        System.out.println(z);
    }
}
