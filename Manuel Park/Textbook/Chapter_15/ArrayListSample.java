package Chapter_15;
import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> myStringArrays = new ArrayList<String>();

        myStringArrays.add("Hello0");
        myStringArrays.add("Hello1");
        myStringArrays.add("Hello2");

        String myString1 = myStringArrays.get(1);
        System.out.println(myString1);
        System.out.println();

        myStringArrays.add(1, "Java1");
        for (String myStringVar : myStringArrays) {
            System.out.println(myStringVar);
        }
        System.out.println();

        myStringArrays.remove(0);
        for (String myStringVar : myStringArrays) {
            System.out.println(myStringVar);
        }
    }
}
