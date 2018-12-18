package com.sort.test;

/**
 * @author wangmeng
 * @date 18/12/18
 */
public class BubbleSort {
    public static void bubbleSort(int[]a,int n){
        int exchange = 0;
        if(n >=2){
            for(int i=0;i<=a.length-1;i++){
                for(int j=i+1;j<=a.length-1;j++){
                    if(a[i]>a[j]){
                        int tmp;
                        tmp= a[i];
                        a[i]=a[j];
                        a[j]= tmp;
                        exchange++;

                    }
                }
            }
        }
        System.out.println("交换的次数："+exchange);

        for(int t:a){
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,8,6};
        bubbleSort(arr,4);
    }

}
