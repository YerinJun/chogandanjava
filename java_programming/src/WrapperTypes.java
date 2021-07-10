public class WrapperTypes {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        float floatNumber = integerNumber.floatValue(); // 3.0f
        double doubleNumber = integerNumber.doubleValue(); // 3.0d
        String stringNumber = integerNumber.toString(); // "3"


        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(stringNumber);
    }
}
