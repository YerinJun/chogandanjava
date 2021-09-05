package part10;

public class Parameters {
    public static void main(String[] args) {
        printSum(2,3);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }
}
