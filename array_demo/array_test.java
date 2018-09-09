package array_demo;

import java.util.Arrays;
public class array_test {
    public static void main(String[] args) {
        //获取数组中的最大值
        int result,result2;
        int[] arr = new int[]{-2, -1, -8, -1, -5, -3,-29};
        int[] result3;
        result = getMax(arr);
        result2 = getMax_index(arr);
        result3 = getrange(arr);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(Arrays.toString(result3));
    }

    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i] >max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMax_index(int[] arr)
    {
        int maxindex=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > arr[maxindex]) {
                maxindex=i;
            }
        }
        return arr[maxindex];
    }

    //对数组中的词进行排序
    public static int[] getrange(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++) {
            for(int k=i+1;k<arr.length;k++) {
                if (arr[i] > arr[k]) {
                    int temp = arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
    return arr;
    }
}
