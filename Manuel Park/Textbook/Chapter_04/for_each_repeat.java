package Chapter_04;

public class for_each_repeat
{
    public static void main(String[] args)
    {
        int[] englishScores = {80, 90, 30, 40, 70, 20, 10, 50, 100, 60};
        int sum = 0;
        double average = 0.0;

        for(int score : englishScores)
        {
            sum += score;
        }
        System.out.println(sum);

        average = (double)sum / (double)englishScores.length;
        System.out.println(average);
    }
}
