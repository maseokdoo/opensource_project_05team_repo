package Chapter_12.InterfaceCalculator;

public class GoodCalculator implements Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
