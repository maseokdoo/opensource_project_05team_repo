package Chapter_05;

public class print
{
    public static void main(String[] args)
    {
        String name = "David";
        int age = 32;

        System.out.println("Name: " + name + ", Age: " + age);
        System.out.print("Name: " + name + ", Age: " + age);
        System.out.printf("Name: %s, Age: %d", name, age);

        System.out.printf("Age: |%-5d|\n", age);
        System.out.printf("Age: |%7.2f|\n", (double)age);
        System.out.printf("Age: |%-7.2f|", (double)age);
    }
}
