package Chapter_03;

public class for_GuGuDan
{
    public static void main(String[] args)
    {
        for(int i = 2; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
