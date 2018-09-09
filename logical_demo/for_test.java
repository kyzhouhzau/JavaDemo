package logical_demo;

public class for_test
{
    public static void main(String[] args)
    {
        //第一个循环控制行数
        for(int x=1;x<=5;x++)
        {
            //第二个循环控制列数
            for(int y=1;y<=x;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
        //打印乘法表
        for(int x=1;x<=9;x++)
        {
            for(int z=9;z>x;z--)
            {
                System.out.print("\t");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
        //打印等边三角
        for(int x=1;x<=5;x++)
        {

            for (int y=1;y<x;y++)
            {
                System.out.print(" ");
            }
            for(int y=5;y>=x;y--)
            {
                System.out.print("*"+" ");
            }
        System.out.println();
        }
    }
}
