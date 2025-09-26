package Chapter_11;

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public void add() {
        result += 1;
    }
    public void add(int a) {
        result += a;
    }
    public void add(int a, int b) {
        result = a + b;
    }
    public void add(String a, String b) {
        System.out.println(a + b);
    }

    public void add(String a, int b) {
        System.out.println(a + Integer.valueOf(b));
    }
}
