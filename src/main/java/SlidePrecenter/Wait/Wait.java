package SlidePrecenter.Wait;

public class Wait {
    public static void wait (int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
