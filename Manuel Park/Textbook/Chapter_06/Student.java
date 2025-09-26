package Chapter_06;

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
    
    public double getGpa()
    {
        return gpa;
    }
}
