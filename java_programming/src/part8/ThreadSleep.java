package part8;

public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("Let me tell you what you are thinking right now.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep Fail!");
        }

        System.out.println("Nene Chicken!!!");
    }
}
