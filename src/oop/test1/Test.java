package oop.test1;

/**
 * @author labuladuo
 * @date 2022/6/2
 */
public class Test {
    public Test() {
        System.out.println("父类被初始化");
    }

    public String hello() {
        System.out.println("this is test1");
        return "this is test1";
    }

    public void selfFunction(){
        System.out.println("父类方法被调用");
    }
}
