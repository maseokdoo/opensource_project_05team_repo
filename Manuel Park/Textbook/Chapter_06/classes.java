package Chapter_06;

public class classes
{
    public class Student
    {
        String name;
        double gpa;

        public Student(String pName, double pGpa)
        {
            name = pName;
            gpa = pGpa;
        }

        public String getName()
        {
            return name;
        }

        public void setGpa()
        {
            gpa = 4.3;
        }
    }

    public class Circle
    {
        double radius;
        String colour;

        public double getRadius()
        {
            return radius;
        }
        
        public double getArea()
        {
            return (3.14 * radius * radius);
        }
    }
}
