package Chapter_04;

public class second_dim_array
{
    public static void main(String[] args)
    {
        int[][] englishScores = 
        {
            {100, 0, 50, 50},
            {0, 50, 50, 100},
            {25, 25, 75, 75},
        };

        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                sum += englishScores[i][j];
            }
        }
        System.out.println(sum);

        average = (double)sum / (double)12;
        System.out.println(average);
    }
}
