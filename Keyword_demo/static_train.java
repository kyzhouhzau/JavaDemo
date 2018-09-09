package Keyword_demo;

public class static_train {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.name = "zhoukayin";
        p.age = 24;
        p.show();
    }
}
/*static 的特点；
1.static 是一个修饰符，用于修饰成员（成员变量，成员函数）。
2.static 优先于对象存在，随着类的加载而存在。
3.ststic 修饰的成员被所有的对象共享。
4.static 修饰的成员可以用类名调用。
5.static 修饰的数据是共享的数据，对象中存储的数据是特有的数据。

成员变量和静态变量的区别。
1.成员变量随着对象的创建而存在，随着对象的被回收而释放。
成员变量随着类的加载而催在，随着类的消失而消失。
2调用方式不同，成员对象只能被对象调用，
静态变量可以被对象调用，还可以被类名字调用。
3.别名不同

4.数据存储的位置不同
成员变量存储在对象的堆里面。
静态变量存储在方法区中的静态区，所以也叫对象的共享数据区。


静态使用注意事项：
1.静态方法只能访问静态成员（变量，函数），
2.静态方法中不能用this,和super，
3，主函数是静态。

*/
class Person2
{
    String name_;//成员变量，实例变量。
    //静态变量，类变量。
    static String name;//static关键字，表示该属性为静态，既可以被对象调用（p.name），也可以被类名调用(Keyword_demo.Person.name)
    int age;

//    Keyword_demo.Person2(String name, int age) {
//        this.name=name;
//        this.age=age;
//    }

    void show() {
        System.out.println(name + ':' + age);
    }
}