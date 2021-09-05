package part10;

public class ReturnValue {
    public static void main(String[] args) {
        int result = add(2,3);
        System.out.println("2 + 3 = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
