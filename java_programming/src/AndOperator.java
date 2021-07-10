public class AndOperator {
    public static void main(String[] args) {
        int age = 15;
        if(age < 10 || age > 20) {
            System.out.println("10대 아님");
        }   else {
            System.out.println("10대일껄?");
        }

        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);
    }
}
