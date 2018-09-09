package logical_demo;

public class if_train
{
    public static void main(String[] args)
    {
        /*
        第一类：
        if(表达式）
        {
        执行语句；
        }
        第二类：简化格式b = a>1?100:200(当结果是一个具体的结果时)
        if(表达式）
        {
        执行语句
        }
        else
        {
        执行语句
        }
        第三类：
        if(表达式)
        {
        执行语句
        }
        else if (表达式)
        {
        执行语句
        }
        else
        {
        执行语句
        }
         */
        int x = 4;
        if (x > 3) {
            System.out.println(x);
        }
        else
        {
            System.out.println("False");
        }
    }
}
