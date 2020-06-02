package Bubble;

import java.util.Arrays;

//练习：冒泡排序和快速排序
public class Demo {
    public static void main(String[] args) {
        int[] arr={2,1,5,13,16,14,6,18,20,12,15,9,13,17,4};
//      arr=bubbleSort(arr);
        ksSort(arr);
        int[] brr=sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }

    //快速排序入口
    private static void ksSort(int[] arr) {
        if(arr.length>0){
            sort(arr,0,arr.length-1);
        }
    }
    //快速排序
    private static void sort(int[] arr, int left, int right) {
        int i=left;
        int j=right;
        //递归出口
        if(i>j){return;}
        //中间值
        int k=arr[i];
        while(i<j){
            while(i<j&&arr[j]>k){
                j--;
            }
            while(i<j&&arr[i]<=k){
                i++;
            }
            //交换
            if(i<j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        //i=j出循环，交换中间值和此时的arr[i]
        k=arr[i];
        arr[i]=arr[left];
        arr[left]=k;

        //左边递归
        sort(arr,0,i-1);
        //右边递归
        sort(arr,i+1,right);
    }

    //冒泡排序
    private static int[] sort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

}

