package Chapter_05;
import java.util.Scanner;

public class scan_string
{
    public static void main(String[] args)
    {
        String stringInput = "123 abc def";
        Scanner sc = new Scanner(stringInput);
        int a = sc.nextInt();
        String b = sc.next();

        boolean tf = sc.hasNext();
        System.out.println("입력 값이 있는가?: " + tf);
        String c = null;
        if(tf)
        {
            c = sc.next();
        }
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        System.out.println("Third: " + c);

        boolean tf2 = sc.hasNext();
        System.out.println("입력 값이 또 있는가?: " + tf2);
    }
}
