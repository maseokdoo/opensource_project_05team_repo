package Chapter_12.AbstractCalculator;

public class UseCalculator {
    public static void main(String[] args) {
        ChildCalculator childCal = new ChildCalculator();

        int result = childCal.minus();
        System.out.println("minus() 결과: " + result);
    }
}
