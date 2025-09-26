package Chapter_08;

public class MinusCalculator extends AddCalculator
{
    public MinusCalculator(int pa, int pb)
    {
        super(pa, pb);
    }

    public void minus()
    {
        System.out.println(a - b);
    }
}
