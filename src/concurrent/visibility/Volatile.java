package concurrent.visibility;

/**
 * @author labuladuo
 * @date 2022/5/26
 */
public class Volatile {
    class VolatileExample {
        int x = 0;
        volatile boolean v = false;

        public void writer() {
            x = 42;
            v = true;
        }

        public void reader() {
            if (v == true) {
                System.out.println(x);
            }
        }
    }
}
