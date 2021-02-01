import org.junit.jupiter.api.Test;

/**
 * @Author: xia
 * @Date: 2021/2/1 19:15
 * @Version: v1.0
 */
public class BlockedTest {


    @Test
    public void testBlocked() throws InterruptedException {

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "a");

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "b");

        a.start();
        Thread.sleep(2000L);
        b.start();
        System.out.println(a.getName() + ":" + a.getState());
        System.out.println(b.getName() + ":" + b.getState());
    }

    private synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
