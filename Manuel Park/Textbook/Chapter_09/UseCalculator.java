package Chapter_09;

public class UseCalculator {
    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        cal.calculate(3, '+', 4);
        cal.calculate(3, '-', 4);
        cal.calculate(3, '*', 4);
    }
}
