package com.extend.test;

/**
 * @author wangmeng
 * @date 18/11/23
 */
public class Base {
    public  static String s = "static base";
    public   String m = " base";
    public  static void testStatic(){
        System.out.println(("base static" + s));
    }

    public Base(){
        test();
    }

    public void test(){
    }
}
