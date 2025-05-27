import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        Collections.sort(fruits, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
