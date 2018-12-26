package com.extend.test;

/**
 * @author wangmeng
 * @date 18/11/23
 */
public class Child extends Base {
    public  static String s = "child base";
    public   String m = " base";
    public  static void testStatic(){
        System.out.println(("child static" + s));
    }
    private int a = 123;

    public Child() {

    }

    @Override
    public void test() {
        System.out.println(a);
    }

    public static void main(String[] args) {
//        Child child = new Child();
//        Base base = child;
//        (base.s).sout;
//        System.out.println((base.m));

    }


}
