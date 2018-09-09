package arrange_demo;
import java.util.Arrays;
public class arange
{
    /*
    外循环控制循环次数
     */
    //冒泡排序
    public static int [] bubble(int [] arr)
    {

        for (int i=0;i<arr.length-1;i++)
        {
            for (int y=0;y<arr.length-1-i;y++)
            {
                if(arr[y]>arr[y+1]){
                    int temp;
                    temp = arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        return arr;
    }
    //获得索引号；

    public static int getIndex(int[] arr, int key) {
        for (int x =0;x<arr.length;x++) {
            if (arr[x] == key)
                return x;
        }
        return -1;
    }

    //折半查找
    public static int halfsearch(int [] arr,int key) {
        int min,max,mid;
        min=0;
        max = arr.length-1;
        mid=(max+min)/2;
        while (arr[mid]!=key) {
            if (key > arr[mid]) {
                min = mid+1;
            }else if (key<arr[mid]){
                max = mid-1;
            }
            if (max<min)
                return min;//return -1
            mid = (max+min)/2;
        }
        return mid;
    }

    public static void main(String[] args) {
        int [] arr={1,14,24,63,2,4,64,23};
        int [] arr2={2,4,6,8,9,12,32,44,67,89};
        System.out.println(Arrays.toString(bubble(arr)));
        System.out.println(getIndex(arr,24));
        System.out.println(halfsearch(arr2,5));
    }
}
