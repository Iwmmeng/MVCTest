package com.sort.test;

/**
 * @author wangmeng
 * @date 18/12/18
 */
public class InsertSortV2 {
    public static void insertSortV2(int[] a, int n) {
        int tmp = 0;
        int tmpValue = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                tmpValue = a[i + 1];
                a[i + 1] = a[i];
                tmp = i;
                break;
            }
        }
        for(int i=tmp+1;i<=a.length-1;i++) {
            for (int j = tmp - 1; j >= 0; j--) {
                a[j + 1] = a[j];
                if (a[tmp + 1] > a[j]) {
                    a[j+1] = tmpValue;
                    break;
                }
            }
        }

        for(int p:a){
            System.out.println(p);
        }

    }

    public static void main(String[] args) {
//        int[] arr1 ={2,4,7,3};
        int[] arr2 ={2,1,7,3};

//        insertSortV2(arr1,4);
        insertSortV2(arr2,4);

    }




}


