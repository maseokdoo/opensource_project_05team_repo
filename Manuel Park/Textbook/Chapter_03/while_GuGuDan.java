package Chapter_03;

public class while_GuGuDan
{
    public static void main(String[] args)
    {
        int i = 2;
        while(i <= 9)
        {
            int j = 1;
            while(j <= 9)
            {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
