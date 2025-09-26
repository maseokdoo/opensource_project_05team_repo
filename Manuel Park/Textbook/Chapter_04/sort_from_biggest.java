package Chapter_04;

public class sort_from_biggest
{
    public static void main(String[] args)
    {
        int[] englishScores = {100, 30, 40, 20, 90, 50, 60, 10, 70, 80};
        int temp = 0;
        for(int i = 0; i < englishScores.length; i++)
        {
            for(int j = i + 1; j < englishScores.length; j++)
            {
                if(englishScores[i] < englishScores[j])
                {
                    temp = englishScores[i];
                    englishScores[i] = englishScores[j];
                    englishScores[j] = temp;
                }
            }
            System.out.print(englishScores[i] + " ");
        }
    }
}
