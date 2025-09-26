package Chapter_04;

public class score_average
{
    public static void main(String[] args)
    {
        int[] englishScores = {80, 90, 30, 40, 70, 95, 76, 98, 100, 77};
        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < 10; i++)
        {
            sum += englishScores[i];
        }
        System.out.println(sum);

        average = (double)sum / (double)englishScores.length;
        System.out.println(average);
    }
}
