package Chapter_15;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args){
        ArrayList<String> myStringArrays = new ArrayList<String>();

        myStringArrays.add("Hello0");
        myStringArrays.add("Hello1");
        myStringArrays.add("Hello2");

        Iterator<String> myIterator = myStringArrays.iterator();
        while (myIterator.hasNext()) {
            String myString = myIterator.next();
            System.out.println(myString);
        }
    }
}
