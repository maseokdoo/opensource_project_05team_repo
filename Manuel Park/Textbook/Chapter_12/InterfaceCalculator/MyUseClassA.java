package Chapter_12.InterfaceCalculator;

public class MyUseClassA {
    public static void main(String[] args) {
        Calculator myCal = new GoodCalculator();
        int result = myCal.add(5, 4);
        System.out.println(result);
    }
}
