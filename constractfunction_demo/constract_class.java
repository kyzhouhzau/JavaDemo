package constractfunction_demo;

/*
 * 子类父类中构造函数的特点。
 *子类所有实例化过程：子类中所有的构造函数默认都会访问父类中空参数构造函数。
 * 为什么子类实例化时要访问父类空参数
 *super 和this只能定义在第一行
 * 所以This调用后就不能调用super
 * */
class Fu {
    Fu(){
        System.out.println("FU class");

    }
}

class Zi extends Fu{
    Zi()
    {
        //super();这里存在一个super调用父类中的空参数的构造函数。
        //等同于用super()调用父类方法。
        System.out.println("constractfunction_demo.Zi class");
        //return;
    }
}
/*
* 一个对象的实例化过程
* 1.JVM会去读取指定路径下的Person.class文件，并加载进neicun
* 并先加载父类
* 2。在内存中开辟空间，分配地址。
* 3.并对对象中的属性默认初始化。
* 4。对构造函数进行初始化
* 5.
*
* */
public class constract_class {
    public static void main(String[] args) {
        new Zi();

    }

}
