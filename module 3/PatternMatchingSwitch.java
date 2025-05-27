public class PatternMatchingSwitch {

    public static void checkObjectType(Object obj) {
        // Java 21 pattern matching for switch
        String result = switch (obj) {
            case Integer i -> "Integer with value: " + i;
            case String s -> "String with value: " + s;
            case Double d -> "Double with value: " + d;
            case Boolean b -> "Boolean with value: " + b;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkObjectType(123);
        checkObjectType("Hello");
        checkObjectType(45.67);
        checkObjectType(true);
        checkObjectType(null);
        checkObjectType(new StringBuilder("test"));
    }
}
