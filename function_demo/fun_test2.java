package function_demo;

public class fun_test2
{
    public static void main(String[] args) {
        char a;

        print99(5);
        a = getgrade(86);
        System.out.println(a);
    }
//定义功能，打印99乘法表
    public static void print99(int num) {
        for(int x=1;x<=num;x++) {
            for(int y=1;y<=x;y++) {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }

//    根据考生成绩获取分数对应的等级

    public static char getgrade(int x) {
        char y;
        if (x <= 60) {
            y = 'E';
        } else if (x > 60 && x <= 69) {


            y = 'E';
        } else if (x > 70 && x <= 79) {
            y = 'C';
        } else if (x > 80 && x <= 89) {
            y = 'B';
        } else  {
            y = 'A';
        }
        return y;
    }
}
