package array_demo;

public class test1 {
    public static void main(String[] args) {
        //2*8最快的运算方式
        System.out.println(2<<3);
        //对两个整数变量的值进行变换
        int a = 3,b = 5;
        /*
        int c;
        c=a;
        a=b;
        b=c;

        */
        /*
        a = a + b;//但当和的值太大将超出int范围；
        b = a - b;
        a = a - b;
        */
        a = a ^ b;//^一个数亦或某个数两次，值不变；
        b = a ^ b;
        a = a ^ b;
        System.out.println("a="+a+";b="+b);
    }
    {
        /*
        三元运算符
        （条件）？表达式一：表达式二；
         */
        int a = 3,b = 4;
        int max_ = (a > b) ? a : b;
        System.out.println(max_);

    }

}
