package Chapter_05;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scan_file
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("Chapter_05/read.txt");
        Scanner sc = new Scanner(file, "UTF-8");

        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
    }
}
