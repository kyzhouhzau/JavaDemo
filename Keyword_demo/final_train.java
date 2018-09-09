package Keyword_demo;/*
* 标题：final 关键字
* 可以修饰类，方法，变量
* final修饰的方法不可以被继承
* final修饰的方法不可以被覆盖
* final修饰的变量是一个常量，只能被赋值一次
* 内部只能访问被final修饰的局部变量
* 成员一旦被final都应当加static(不需要对象，类名直接访问)
*为什么要用final修饰变量。
* 其实在程序中如果该数据是固定的直接引用就可以了，但阅读行上很差，所以引入final固定。
* 开发中凡是固定的值都用fanal，且注意名字大写。
*/
//注：引入final是因为继承会打破封装性。

class final_fu {
    static void method() {
        //调用了底层系统资源，但继承会修改该方法。

    }

    final void method1() {

    }
}

class final_zi extends final_fu {
    static void method() {
        int x= 9;
        System.out.print(x);


    }
}


public class final_train {
    public static void main(String[] args) {

//        Keyword_demo.final_zi zi = new Keyword_demo.final_zi();
        final_zi.method();
    }

}
