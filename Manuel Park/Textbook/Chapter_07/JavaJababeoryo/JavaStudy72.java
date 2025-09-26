package Chapter_07.JavaJababeoryo;
import Chapter_07.Intermax.Circle;

public class JavaStudy72
{
    public static void main(String[] args)
    {
        double radius = 7.0;
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        System.out.println("반지름 " + radius + "인 원의 면적: " + area);
    }
}
