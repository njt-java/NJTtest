package Bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序：它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 *
 * 快速排序:基于二分的思想，对冒泡排序的一种改进,通过一趟排序将要排序的数据分割成独立的两部分：
 * 分割点左边都是比它小的数，右边都是比它大的数。然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class BubbleSort {
    //调用排序方法
    public static void sort(int[] a) {
        if (a.length > 0) {
            sort(a, 0, a.length - 1);
        }
    }
    //快速排序.使用递归的思想
    public static void sort(int[] arr,int left,int right){
        int i=left;
        int j=right;
        //校验；防止下标越界
        if(i>j){return;}
        //定下中间数：k 左边的那个数
        int k=arr[i];
        //循环执行条件 i<j；这里的跳出条件是i==j
        while(i<j) {
            //找出比中间数k小的数
            while (i < j && arr[j] > k) {
                j--;
            }
            //找出比中间数k大的数
            while (i < j && arr[i] <= k) {
                i++;
            }
            //交换
            if (i < j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        //到这里一定是i==j的；需要将arr[i]与前面的中间值k(arr[left])互换；
        //k作为中间值
        k=arr[i];
        arr[i]=arr[left];
        arr[left]=k;

        //对左边进行排序,递归算法:0到i-1
        sort(arr, left, i-1);
        //对右边进行排序，递归算法:i+1到right
        sort(arr,i+1,right);
    }




    public static int[] bubbleSort(int[] arr){
        int temp=arr[0];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                //如果第一个比第二个大，就交换它们两个；
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,13,16,14,6,18,20,12,15,9,13,17,4};
//      arr=bubbleSort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
