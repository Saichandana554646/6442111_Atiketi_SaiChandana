public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;  // Casting double to int

        System.out.println("Double value: " + myDouble);
        System.out.println("Double casted to int: " + myInt);

        int myInt2 = 42;
        double myDouble2 = myInt2;  // Implicit casting from int to double

        System.out.println("Int value: " + myInt2);
        System.out.println("Int casted to double: " + myDouble2);
    }
}
