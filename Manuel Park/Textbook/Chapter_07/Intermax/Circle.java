package Chapter_07.Intermax;

public class Circle
{
    double radius;
    String colour;

    public Circle(double pRadius)
    {
        radius = pRadius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return (3.14 * radius * radius);
    }
}
