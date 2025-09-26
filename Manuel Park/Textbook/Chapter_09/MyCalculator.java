package Chapter_09;

public class MyCalculator {
    public void calculate(int a, char b, int c) {
        if (b == '+') {
            add(a, c);
        } else if (b == '-') {
            minus(a, c);
        } else {
            System.out.println("지원하지 않는 연산자입니다!");
        }
    }

    protected void add(int a, int c) {
        System.out.println(a + c);
    }
    void minus(int a, int c) {
        System.out.println(a - c);
    }
}