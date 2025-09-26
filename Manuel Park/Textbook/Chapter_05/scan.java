package Chapter_05;
import java.util.Scanner;

public class scan
{
    public static void main(String[] args)
    {
        try (Scanner inputReader = new Scanner(System.in)) {
            String strInput = inputReader.nextLine();
            System.out.println(strInput);
        }
    }
}
