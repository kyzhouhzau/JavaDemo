package array_demo;

public class arrat_train {

    public static void main(String[] args) {
        //数组第一种定义格式
        int[] array = new int[5];
        //数组第二种定义格式
        //元素类型[] 数组名=new 元素类型[]{元素，。。。}
        int[] arr = new int[]{1,2,3};
        //int[] arr={1,2,3};
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        //反向遍历
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);

        /*
        对数组猜操作，基本动作就是存取
        核心就是操作角标
         */
//        System.out.println(arr[0]);
    }
}
