package com.demo.test;

import java.util.*;

/**
 * @author wangmeng
 * @date 18/12/26
 */
public class Demo {
    public static void main(String[] args) {
//        solution("77 88");
//        solution4("12,13,14,5,6,7,8,9,10");
//        solution3("5");
//        solution2("10 10 11 12 12 11 16");
<<<<<<< HEAD
        System.out.println(isHuiwen666("2"));
        System.out.println(isHuiwen666("234"));
        System.out.println(isHuiwen666("2562652"));
=======
        Integer[] list11 = new Integer[]{ 1,2,3,4,8,22,44};
        Integer[] list12 = new Integer[]{ 0,2,3,7,33,66};

        List<Integer> list1 = Arrays.asList(list11);
        List<Integer> list2 = Arrays.asList(list12);
        mergeList(list1,list2);
>>>>>>> 9e7bbfc33f4257792fd8ca795c11956cfee754fc

    }

    /**
     * 1. 包含两个非负数 aa 和 bb，以空格分隔；a 和 b 保证小于 2^{32}
     * 你的输出是对一行数据处理的结果，也即 a+b的结果。
     */

    private static String solution(String line) {
        String result;

        String[] arr = line.split("\\ ");
        result = String.valueOf(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        System.out.println("result====" + result);
        return result;
    }


    /**4. 给出一个有序数列随机旋转之后的数列，如原有序数列为：[0,1,2,4,5,6,7] ，旋转之后为[4,5,6,7,0,1,2]。
     *  假定数列中无重复元素，且数列长度为奇数。 求出旋转数列的中间值。如数列[4,5,6,7,0,1,2]的中间值为4。
     *输入4,5,6,7,0,1,2，输出4
     * */
    private static String solution4(String line) {
        List max= new ArrayList();
        List min=new ArrayList();
        String[] stringsarr = line.split(",");
        int tmp=Integer.parseInt(stringsarr[0]);
        if(line.length()==1){
            System.out.println("line"+line);
            return line;
        }else if(line.length()< 0){
            return null;
        }else {
            for (int i = 1; i < stringsarr.length; i++) {
                if (Integer.parseInt(stringsarr[i] ) < tmp) {
                    min.add(stringsarr[i]);
                } else {
                    tmp = Integer.parseInt(stringsarr[i] );
                    max.add(stringsarr[0]);
                    max.add(stringsarr[i]);
                }
            }
            min.addAll(max);
            for(int i=0;i<min.size();i++){
                System.out.println("min 的值"+ min.get(i));
            }
            System.out.println("===="+String.valueOf(min.get((min.size() + 1) / 2)) );
            return String.valueOf(min.get((min.size() + 1) / 2));
        }
    }

    /**
     * 10.在你面前有一个n阶的楼梯，你一步只能上1阶或2阶。 请问计算出你可以采用多少种不同的方式爬完这个楼梯。
     *输入5，10 输出8，89
     * */

    //// TODO: 18/12/27 这个终止条件怎么写呢？？？？想要停下来。。。
//    private static int solution3(String line) {
//        int step = Integer.parseInt(line);
//        if(step >2){
//            System.out.println("step -1 "+ solution3(String.valueOf(step-1)));
//            System.out.println("step -2 "+ solution3(String.valueOf(step-2)));
//            return (solution3(String.valueOf(step-1))+solution3(String.valueOf(step-2)));
//        }
//        else if(step == 1){
//            solution3("1") = 1;
//        }
//        else if(step ==2){
//            return 2;
//        }else {return 0;}
//    }

    /**
     * 2. 给出N个数字。其中仅有一个数字出现过一次，其他数字均出现过两次，找出这个出现且只出现过一次的数字
     */
    private static int solution2(String line) {
        Map<String, Integer> map = new HashMap();
        String[] strArr = line.split("\\ ");
        for (String string : strArr) {
            if (map.containsKey(string)) {
                Integer value = map.get(string) + 1;
                map.put(string, value);
            } else {
                map.put(string, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println("====" + Integer.parseInt(entry.getKey().toString()));
                return Integer.parseInt(entry.getKey().toString());
            }
        }
        return 0;
    }
    /**11. 给定任意一个较短的子串，和另一个较长的字符串，
     * 判断短的字符串是否能够由长字符串中的字符组合出来，且长串中的每个字符只能用一次。
     * 一行数据包括一个较短的字符串和一个较长的字符串，用一个空格分隔，如： ab aab bb abc aa cccc uak areuok
     * */



    /**
     * 两个有序list，length不确定，求得一个有序的两个list的并集
     * */

<<<<<<< HEAD


    /**
     *666. 判断一个字符串是否为回文
    **/
    public static boolean isHuiwen666(String string) {
        int length = string.length();
        if (length > 1) {
            for (int i = 0; i <= length / 2; i++) {
                if (string.charAt(i) != string.charAt(length - 1 - i)) {
                    System.out.println("bu shi huiwen"+string);
                    return false;
                }
            }
            System.out.println("pass pass"+string);
            return true;

        } else if (length == 1) {
            System.out.println("okokok");
            return true;
        } else {
            System.out.println("nullnullnull");
            return false;
        }
    }








=======
    public static void mergeList(List<Integer> list1,List<Integer> list2){
        List list= new ArrayList();
        int flag1=0;
        int flag2=0;
        for(int i=0;i<list1.size()+list2.size();i++){
            if(flag1==list1.size()){
                list.add(list2.get(flag2++));
            }else if (flag2==list2.size()){
                list.add(list1.get(flag1++));
            }else {
                if (list1.get(flag1)<list2.get(flag2)){
                    list.add(list1.get(flag1++));
                }else {
                    list.add(list2.get(flag2++));
                }
            }
        }
        System.out.println(list.size());
        for(int a=0;a<list.size();a++){
            System.out.println(list.get(a));
        }
    }
>>>>>>> 9e7bbfc33f4257792fd8ca795c11956cfee754fc
}
