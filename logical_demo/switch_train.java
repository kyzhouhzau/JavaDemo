package logical_demo;

public class switch_train {
    public static void main(String[] args) {
        /*
        switch(表达式){
            case 取值1：
            执行语句；
            break;
            case 取值2：
            执行语句；
            break;


            default:
            执行语句；
            break;
        }

         */
        int x = 2;//byte,int,short,char
        switch (x) {
            case 1:
                System.out.println("a");
//                break;
            case 2:
                System.out.println("b");
//                break;
            case 3:
                System.out.println("d");
//                break;
            default:
                System.out.println("LLLLL");
                break;
        }
        int a = 2,c=3;
        char oper = '-';
        switch (oper) {
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a - c);
                break;
            case '*':
                System.out.println("a*c");
                break;
            default:
                System.out.println("无法运算");
                break;
        }


    }
}
