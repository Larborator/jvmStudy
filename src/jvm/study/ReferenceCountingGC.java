package jvm.study;

/**
 * @author labuladuo
 * @date 2022/5/13
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private final byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objcA = new ReferenceCountingGC();
        ReferenceCountingGC objcB = new ReferenceCountingGC();
        objcA.instance = objcB;
        objcB.instance = objcA;

        objcA = null;
        objcB = null;

        System.gc();
        System.out.println(objcA);
        System.out.println(objcB);
    }

    public static void main(String[] args) {
        testGC();
    }
}
