package Operate_demo;

public class VarDemo
{
    public static void main(String[] args)
    {
        //数据类型 变量名=初始化值;
        byte b = 3;
        int age = 2;
        char name ='z';
        long l = 123456789111L;
        float f = 2.3f;
        double d = 3.4;
        b=8;//使用变量

        System.out.println(b);
        System.out.println(name);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(age);
        //不同类型的不能相加，但可以类型提升
        {
        byte a = 1;
        a = (byte)(a+1234);//强行转换内容但会丢失精度
        System.out.println(a);
        System.out.println('你'+0);//unicode码表
        }
    }
}
