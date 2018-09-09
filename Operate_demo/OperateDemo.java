package Operate_demo;

public class OperateDemo
{
    public static void main(String[] args)
    {
        {//算数运算符：+，-，*，/,%
            //++,--
            int x = 6370;
            x = x / 1000 * 1000;

            System.out.println(x);//Java是强类型
        }
        {
            int a=3,b,c;
//            b = a++;
            c = ++a;
            //a先将自己的值预存出来然后自己自加，最后再将预存的a赋给b
//            System.out.println("a="+a+",b="+b);
            System.out.println("a="+a+",c="+c);
        }
        {
            //赋值运算。=，+=，-=，*= ，/=，%=
            short s = 3;
//            s = s + 4;//无法编译；无法再赋值给低字节类型，原因是s值的获取不确定；
            s+=4;//底层在做强制转换；
            System.out.println(s);
        }
        {
            //逻辑运算符
            /*
            * &&：当左边为false时，右边不参与运算
            * */
            int x = 3;
            System.out.println(2<x & x<5);
        }
        {
            /*
            * 位运算：
            * &位运算
            * ~取反
            * ^
            * |位运算
            * <<左移其实就是乘2的次幂
            * >>右移就是除以2，高位补充内容与高位相同
            * >>>无符号右移，无论高位出现什么都用0补充
            * */
            System.out.println(6&3);
        }

    }
}
