package com.demo.test;

import java.util.*

/**
 * @author wangmeng
 * @date 18/12/26
 */
public class Demo {
    public static void main(String[] args) {
//        solution("77 88");

    }

    /**
     * 1. 包含两个非负数 aa 和 bb，以空格分隔；a 和 b 保证小于 2^{32}
     *你的输出是对一行数据处理的结果，也即 a+b的结果。
     * */

    private static String solution(String line) {
        String result;

        String[] arr= line.split("\\ ");
        result= String.valueOf(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        System.out.println("result===="+ result);
        return result;
    }


    /**4. 给出一个有序数列随机旋转之后的数列，如原有序数列为：[0,1,2,4,5,6,7] ，旋转之后为[4,5,6,7,0,1,2]。
     *  假定数列中无重复元素，且数列长度为奇数。 求出旋转数列的中间值。如数列[4,5,6,7,0,1,2]的中间值为4。
     *输入4,5,6,7,0,1,2，输出4
     * */
    private static String solution2(String line) {
        String result;

        for(char ch:line.toCharArray()) {
            List list = new ArrayList();
            list.add(ch-'0');
            list.
            for(int i =0;i<list.size()-1;i++){
                if((list.get(i) < list.get(i+1)){

                }
            }

            list.sort();

        }




        return result;


    }




}
