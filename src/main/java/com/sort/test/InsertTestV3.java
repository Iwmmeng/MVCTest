package com.sort.test;

/**
 * @author wangmeng
 * @date 18/12/18
 */
public class InsertTestV3 {
    public static void insertSortV3(int[] a, int n) {
        int tmp = 0;
        int tmpValue = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                tmpValue = a[i + 1];
                a[i + 1] = a[i];
                tmp = i;
            }
        }
    }
}