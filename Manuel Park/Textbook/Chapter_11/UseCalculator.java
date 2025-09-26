package Chapter_11;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.add();
        cal.add(10);
        cal.add(10, 5);
        cal.add("EXAM", "PLE");

        ChildCalculator childCal = new ChildCalculator();
        childCal.add();
        childCal.add(10);
        childCal.add(10, 5);
        childCal.add(10, 5.73);
        childCal.add("EXAMP", "LE");
        childCal.add("EX", "AM", "PLE");
    }
}
