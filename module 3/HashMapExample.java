import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add student entries (ID Name), type 'exit' to stop:");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            String[] parts = line.split(" ");
            if (parts.length == 2) {
                try {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    studentMap.put(id, name);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid ID format.");
                }
            } else {
                System.out.println("Please enter exactly 2 values: ID and Name");
            }
        }

        System.out.print("Enter student ID to retrieve: ");
        int searchId = scanner.nextInt();
        String studentName = studentMap.get(searchId);
        if (studentName != null) {
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("No student found with ID " + searchId);
        }

        scanner.close();
    }
}
