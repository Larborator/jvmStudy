package oop.test3;

/**
 * @author labuladuo
 * @date 2022/6/2
 */
public class Test extends oop.test2.Test {
    public Test() {
        System.out.println("test3子类被初始化");
    }

    @Override
    public String hello() {
        super.hello();
        System.out.println("this is test3");
        return "this is test3";
    }
}
