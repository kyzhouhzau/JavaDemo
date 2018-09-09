package Operate_demo;

public class toHex {
    public static void main(String[] args) {
        toHex(26);

    }

    public static void train(int num, int base, int ofset)
    {
        char [] biao = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[32];
        int pos=arr.length;
        while (num != 0) {
            int temp = num & base;
            arr[--pos] = biao[temp];
            num = num >> ofset;
        }
        //先到着去做与运算，再反过来写；
        for (int x=pos;x<arr.length;x++) {
            System.out.print(arr[x]);
            }
    }

    public static void toHex(int num) {
        train(num,15,4);
    }
}
