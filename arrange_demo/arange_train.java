package arrange_demo;

import java.util.Arrays;
public class arange_train {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {2, 4, 1, 5, 76, 43, 22};
        System.out.println(Arrays.toString(maopao(arr)));
        //选择排序
        System.out.println(Arrays.toString(xuanze(arr)));
        //二分查找
        int [] arr1 = {2,4,5,6,7,8,9,11,23,45,67};
        System.out.println(erfen(arr1, 23));
        //获得索引号；
        System.out.println(getIndex(arr, 5));
    }

    //冒泡排序
    public static int [] maopao(int[] arr) {
        for(int i = 0;i<arr.length-1;i++) {
            for (int y = 0;y<arr.length-1-i;y++) {
                if (arr[y] >= arr[y + 1]) {
                    int temp;
                    temp = arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        return arr;
    }

    //选择排序
    public static int [] xuanze(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for (int y=i+1;y<arr.length-1;y++) {
                if (arr[i] >= arr[y]) {
                    int temp;
                    temp = arr[i];
                    arr[y]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    //获取索引号；
    public static int getIndex(int [] arr,int key) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    //二分查找
    public static int erfen(int[] arr, int key) {
        int min,max,mid;
        min=0;
        max=arr.length-1;
        mid = (min+max)/2;
        while (arr[mid] != key) {
            if (arr[mid] > key) {
                max = mid-1;
            } else if (arr[mid] < key) {
                min = mid+1;
            }
            if (min>max){
                return -1;
            }
            mid = (min+max)/2;
        }
        return mid;
    }
}
