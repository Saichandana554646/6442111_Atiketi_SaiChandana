public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Result of (10 + 5) * 2 = " + result2);

        // Explanation:
        // In the first expression, multiplication (*) has higher precedence than addition (+),
        // so 5 * 2 is evaluated first, then added to 10.
        // In the second expression, parentheses override precedence, so 10 + 5 is evaluated first.
    }
}
