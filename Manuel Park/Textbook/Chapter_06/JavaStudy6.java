package Chapter_06;

public class JavaStudy6 {
    public static void main(String[] args)
    {
        Circle abc = new Circle(7.0);
        double area = abc.getArea();
        double radius = abc.getRadius();
        System.out.println("반지름 " + radius + "의 넓이는 " + area + "입니다.");

        Student student1 = new Student("David", 3.7);
        Student student2 = new Student("Tony", 4.1);

        String name1 = student1.getName();
        double gpa1 = student1.getGpa();
        System.out.println("학생 " + name1 + "의 평점은 " + gpa1 + "입니다.");

        String name2 = student2.getName();
        double gpa2 = student2.getGpa();
        System.out.println("학생 " + name2 + "의 평점은 " + gpa2 + "입니다.");
    }
}
