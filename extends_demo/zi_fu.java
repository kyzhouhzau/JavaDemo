package extends_demo;/*
标题：面向对象，字符类中的构造函数，子类实例化构成-细节
* 子父类中构造函数的特点
* 在子类构造对象时，发现访问子类构造函数时父类也运行了？
* 在子类的构造函数中第一行有个默认的super()
* 子类的实例化过程：子类的所有构造函数都默认访问父类空参数
* 为什么子类在实例化的时候要访问父类的空构造参数呢？
* 应为子类访问父类，获取父类内容前要看父类如何对自己的内容进行初始化的，所以子类在构造对象是必须访问父类的构造函数。
* 为了完成这个动作就在子类的狗崽函数中加入supper函数。
* 如果父类中没有定义空参数构造函数，子类的构造函数必须明确调用父类中的哪个构造函数。
* 注意：supper()必须在子类构造函数的第一行。因为父类初始化动作要先完成。
*
* */

public class zi_fu {
    public static void main(String[] args) {

        new zi(6);
    }

}

class fu {
    fu()
    {
        System.out.println("extends_demo.fu run");

    }

    fu(int k) {
        System.out.println("B array_demo.test");
    }
}

class zi extends fu {
    zi() {
        super();//代表运行父类的空参数构造函数。与this()不同this()是当前类
        //如果父类不是空参，就用super()指定参数。
        System.out.println("extends_demo.zi run");
        return;

    }

    zi(int x) {
        //super();
        //当这里用this()这样的话supper()就不存在了。他会在this()中调用zi()中调用supper()
        super(3);
        System.out.println("A array_demo.test");
    }
}