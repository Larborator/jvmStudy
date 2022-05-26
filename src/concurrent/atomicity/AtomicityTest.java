package concurrent.atomicity;

/**
 * Atomicity, Visibility, Ordering
 *
 * @author labuladuo
 * @date 2022/5/26
 */
public class AtomicityTest {
    private static long count = 0;

    private void add10K() {
        int idx = 0;
        int cnt = 10000;
        while (idx++ < cnt) {
            count += 1;
        }
    }

    /**
     * 加锁解决
     */
    private void safeAdd10K() {
        int idx = 0;
        int cnt = 10000;
        synchronized (this) {
            while (idx++ < cnt) {
                count += 1;
            }
        }
    }

    public static long calc() throws InterruptedException {
        final AtomicityTest test = new AtomicityTest();
        // 创建两个线程，执行 add() 操作
        Thread thread1 = new Thread(test::add10K);
        Thread thread2 = new Thread(test::add10K);
        // 启动两个线程
        thread1.start();
        thread2.start();
        // 等待两个线程执行结束
        thread1.join();
        thread2.join();
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(calc());
    }
}
