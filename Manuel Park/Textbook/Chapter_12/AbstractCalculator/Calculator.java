package Chapter_12.AbstractCalculator;

public abstract class Calculator {
    int result = 0;
    
    public int add() {
        result += 1;
        return result;
    }

    public abstract int minus();
}
