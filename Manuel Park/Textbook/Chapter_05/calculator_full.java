package Chapter_05;
import java.util.Scanner;

public class calculator_full
{
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        char c = s.next().charAt(0);
        int j = s.nextInt();

        int z = 0;
        if(c == '+')
        {
            z = i + j;
        }
        else if(c == '-')
        {
            z = i - j;
        }
        else if(c == '*')
        {
            z = i * j;
        }
        else if(c == '/')
        {
            z = i / j;
        }
        System.out.println(z);
    }
}
