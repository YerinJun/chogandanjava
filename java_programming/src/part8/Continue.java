package part8;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if ((i&1) == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
