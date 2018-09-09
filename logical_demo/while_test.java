package logical_demo;

public class while_test
{
    /*
    目标：获取1到十10个数字的和；
    思路：while
     */
    public static void main(String[] args)
    {
        int total = 0, x = 1;
        while (x <= 5) {
            total = total + x;
            x++;
        }
        System.out.println("1+2+3+4+5=" + total);

    /*
    目标：输出1~100之间6的倍数出现的次数；
     */
        int a = 1,count=0;
        while (a<=100)
        {

            if (a % 6 == 0)
            {
                count ++;
                System.out.println(a);
            }
            a++;
        }
        System.out.println("count="+count);

    }


}
