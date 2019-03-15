package com.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {
    /**
     * 有序数组旋转后的中间位数
     */
    public static void getMid(List<Integer> list) {
        List tmpList1 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                tmpList1.addAll(list.subList(i + 1, list.size()));
                tmpList1.addAll(list.subList(0, i + 1));
                break;
            }
        }
        System.out.println(tmpList1);
        System.out.println("mid size:====" + tmpList1.size() / 2);
        System.out.println("=====" + tmpList1.get(tmpList1.size() / 2));
    }

    @Test
    public void testGetMid() {
        List list = Arrays.asList(7, 8, 9, 0, 1, 2, 3, 4, 5);
        getMid(list);
    }

    /**
     * 去除list的重复数
     */
    public void getOnly(List list) {
        Set set = new HashSet(list);
        System.out.println(set);
    }

    @Test
    public void testGetOnly() {
        List ls = Arrays.asList(1, 1, 2, 2, 3, 6);
        getOnly(ls);
    }

    /**
     * 输入一个乱序的连续数列，输出其中最长连续数列长度
     */
    public void getMaxLen(List<Integer> list) {
        int count = 1;
        int tmpCount = 1;
        int flag = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                for (int j = i + 1; j < list.size() - 2; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        tmpCount++;
                    } else {
                        flag = j;
                        break;
                    }
                }
            } else {
                for (int j = i; j < list.size() - 1; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        tmpCount++;
                    } else {
                        flag = j;
                        break;
                    }
                }
            }
            if (tmpCount > count) {
                count = tmpCount;
            }
            i = flag;
        }
        System.out.println("count:" + count);
    }

    @Test
    public void testGetMaxLen() {
        List ls = Arrays.asList(1, 2, 3, 6);
        getMaxLen(ls);
    }

    @Test
    public void maxLengthCount1() {
        int maxLength = 0;
        int currentLength = 1;
        int[] arr = new int[]{1, 2, 12,3, 6, 5,11,4,6, 8, 9};
        for (int i = 1; i < arr.length - 1; i++) {
            currentLength++;
            if ((arr[i-1]>arr[i] && arr[i]<arr[i+1]) || (arr[i-1]<arr[i] && arr[i]>arr[i+1])){
                if (currentLength>maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        currentLength++;
        if (maxLength<currentLength){
            maxLength=currentLength;
        }
        System.out.println(maxLength);
    }
    @Test
    public void getMaxLen2(){
        List ls = Arrays.asList(1, 2, 3, 6);
        Collections.sort(ls);
        Collections.reverse(ls);
        System.out.println(ls);
        List<User> users = new ArrayList<>();
        Collections.sort(users,(User user1,User user2)->user2.getAge()-user1.getAge());
    }
    class User{
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public User setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }
    }
/**
 * 获取连续的数，一共有几个这样的数*/
    @Test
    public void getContinueMax(){
        int maxCount =1;
        int tmpCount =1;
        Integer[] ints=new Integer[]{4,3,5,11,7,8,9,10};
        Arrays.sort(ints);
        List<Integer> list=Arrays.asList(ints);
        System.out.println(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)==1){
                tmpCount++;
            }else {
                if(tmpCount>maxCount){
                    maxCount=tmpCount;
                }
                tmpCount=1;
            }
        }if(tmpCount!=1){
            maxCount=tmpCount;
        }
        System.out.println(maxCount+"======");
    }
    /**
     * 短串是否包含在长串中*/
    @Test
    public void isContain() {
        boolean flag = true;
        int count = 0;
        String longStr = "qweraqwtyu";
        String shortStr = "ra";
        for (int i = 0; i < longStr.length(); i++) {
            flag = true;
            if (shortStr.charAt(0) == longStr.charAt(i)) {
                for (int j = 1; j < shortStr.length(); j++) {
                    if (shortStr.charAt(j) != longStr.charAt(i + j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    break;
                }
            } else {
                flag = false;
            }
        }
        System.out.println("flag:" + flag);
    }

    /**
     * 短串是否可以由长串的字符拼成，且长串的字符不可以被重复使用,且最后返回的是字符串类型的true/false*/
    @Test
    public void isConsist(){
        String longStr="kiuybhj";
        String shortStr="ki";
        boolean flag = false;
        char[] longArr = longStr.toCharArray();
        char[] shortArr = shortStr.toCharArray();
        List longList = Arrays.asList(longArr);
        List shortList = Arrays.asList(shortArr);
        for(int i=0;i<shortList.size();i++){
            for(int j=0;j<longList.size();j++){
                if(shortList.get(i)==longList.get(j)){
                    longList.remove(j);
                    flag = true;

                    break;
                }else {
                    flag = false;
                }
            }
        }



    }

}
