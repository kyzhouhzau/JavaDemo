package function_demo;

public class fun_test1
{
    /*
    结果是什么；


    * 需求1：定义一个函数，打印矩形
    * 需求2：定义一个函数，比较两个数是否相等
    * 需求3：定义函数，获取两个数中较大的那个
    * */
    public static void main(String[] args) {
        int b;
        boolean a;
        draw(3, 5);
        a=equal(4,3);
        b=maxmin(5,10);
        System.out.println("a="+a+"\n"+"b="+b);
    }

    public static void draw(int row, int col) {
        for (int x=1;x<=row;x++)
        {
            for (int y=1;y<=col;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean equal(int x, int y)
    {
        if (x == y)
        {
            return true;
        }
        else
            {
            return false;
            }
    }

    public static int maxmin(int x, int y)
    {
        if (x >= y)
        {
            return x;
        }
        else
            {
            return y;
            }

//            return a>b?a:b
    }

}
