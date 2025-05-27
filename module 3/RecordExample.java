import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecordExample {
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 17));
        people.add(new Person("Charlie", 30));

        System.out.println("All persons:");
        people.forEach(p -> System.out.println(p));

        List<Person> adults = people.stream()
            .filter(p -> p.age() >= 18)
            .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(p -> System.out.println(p));
    }
}
