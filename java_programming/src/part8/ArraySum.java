package part8;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int sum = 0;
       for (int i : num) {
           sum += i;
       }
        System.out.println("Sum of Array: " + sum);
    }
}
