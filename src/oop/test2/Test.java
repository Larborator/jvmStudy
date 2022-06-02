package oop.test2;

/**
 * @author labuladuo
 * @date 2022/6/2
 */
public class Test extends oop.test1.Test {

    public Test() {
        System.out.println("test2子类被初始化");
    }

    @Override
    public String hello() {
        System.out.println("this is test2");
        return "this is test2";
    }
}
