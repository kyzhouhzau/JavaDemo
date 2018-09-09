package Keyword_demo;

/*继承会被覆盖
finall关键字
1.finall 是一个修饰符，可以修饰类，方法，变量。
2.finall 修饰类不可以被继承。
3.finall 修饰方法，不可以被重写
4.finall 修饰的变量时常量，只能赋值一次。注：常量最好用大写。


*/
class zhu{
    final void method(){
        //调用底层系统资源
    }
}

class zhutou extends zhu{
    void method_new(){
        System.out.println("haha");
    }
}

public class finall_ {
    public static void main(String[] args) {
        System.out.println("zhoukaiyin");
    }

}
