package Chapter_08;

public class DivideCalculator extends MinusCalculator
{
    public DivideCalculator(int pa, int pb)
    {
        super(pa, pb);
    }

    public void divide()
    {
        System.out.println(a / b);
    }
}
