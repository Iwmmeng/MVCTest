package com.sort.test;

/**
 * @author wangmeng
 * @date 18/12/18
 */
public class InsertSort {
    public static void insertSort(int[] a, int n) {
        int[] b = new int[n];
        int tmp = 0;
        for (int i = 1; i < a.length - 1; i++) {
            b[i] = a[i];
            if (a[i] > a[i + 1]) {
                tmp = i;
                break;
            }
        }
        for (int p : b) {
            System.out.println("找出最大的top值： " + p);
        }

        for (int j = tmp + 1; j < a.length; j++) {
            for (int k = 0; k <= tmp; k++) {
                if (a[j] <= b[k]) {
                    copyArrAndMove(b, k, tmp);
                    b[k] = a[j];
                }
            }
        }
        for (int p : b) {
            System.out.println(p);
        }
    }

    public static void copyArrAndMove(int[] a, int start, int end) {
        for (int i = end; i >= start; i--) {
            a[(i + 1)] = a[i];
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 1, 7, 6};
        insertSort(a, 4);
    }






}
