package Chapter_12.AbstractCalculator;

public class ChildCalculator extends Calculator {
    public int minus() {
        result -= 1;
        return result;
    }
}
