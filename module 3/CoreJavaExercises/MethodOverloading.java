public class MethodOverloading {

    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add two integers: " + add(10, 20));
        System.out.println("Add two doubles: " + add(10.5, 20.3));
        System.out.println("Add three integers: " + add(5, 10, 15));
    }
}
