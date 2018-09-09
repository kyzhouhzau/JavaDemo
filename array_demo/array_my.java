package array_demo;
/*
* 建立一个数组类，用来对数组排序，并打印结果。
* @author zhoukaiyin
* @Time 2018/5/17
* */

import java.lang.reflect.Array;
import java.util.Arrays;
public class array_my {

    //该类中的方法是静态的不需要让其初始化构造函数。通过私有化可以强制其无法创建。
    private array_my(){};
    /*获取最大值*/
    static int get_maxindex(int[] arr) {
        int maxindex = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > arr[maxindex]) {
                maxindex=i;
            }
        }
        return maxindex;

    }
    //从大到小排序。
     static void sort(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int k=0;k<arr.length;k++) {
                if (arr[i] > arr[k]) {
                    swap(arr,i,k);
                }
            }
        }
    }
    //交换数组中位置；
    private static void swap(int[] arr, int i, int k) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i]=temp;
    }
    //打印数组；
    static void print(int[] x) {

        System.out.println(Arrays.toString(x));
    }

}
