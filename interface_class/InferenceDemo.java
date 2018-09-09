package interface_class;

/*
 * 标题：面向对象-接口
 * 当抽象类中的方法全是抽象方法时可以用另一种表示方法。接口interface
 * 此时定义接口使用的关键字不是class而是interface
 * 接口中常见成员
 * 1.全局常量：public static final
 * 2.抽象方法:public abstract void
 * 接口中都是公共成员
 *
 * 类一类之间是继承关系
 * 类一接口是实现
 *
 * 接口的特点：
 * 1.接口对外暴露的特点
 * 2.接口是程序的功能扩展
 * 3.接口的出现降低耦合性
 * 4.接口可以用来多实现
 * 5.类与接口之间是实现关系，而且类可以继承一个类的同时实现多接口。
 * 6.接口与接口之间是继承关系
 *
 *
 * 接口与抽象类的异同点：
 * 1.抽象类需要被继承，单继承，接口需要被实现，多实现。
 * 2.抽象类中可以定义抽象方法和非抽象方法，子类继承后可以直接使用非抽象方法
 * 接口中只有抽象方法，必须由子类去实现
 * 3.抽象类继承，是is a关系，在定义体系的基本共性内容
 * 接口的实现是likea关系，定义体系的额外功能
 *
 * */
interface Demo {
    public static final int NUM=32;
    public abstract void show();
}
interface Demo_N {
    public static final int NUM=32;
    public abstract void show();
}

//接口不能实例化，只有实现了接口的子类覆盖了所有抽象方法后子类才可以被实例化。
class DemoImple implements Demo {
    public void show() {

    }
}
//java中不支持多继承，因为会出现调用的不确定性。
//所以java中将多继承机制进行改良，变成了多实现
//接口与接口之间是继承

class DemoImple_N implements Demo,Demo_N {
    public void show() {

    }
}

//一个类再继承一个类的同时，还可以实现多个接口
//接口的出现避免了单继承的局限性。

public class InferenceDemo {
    public static void main(String[] args) {
        DemoImple D = new DemoImple();
        System.out.println(D.NUM);
        System.out.println(Demo.NUM);
        System.out.println(DemoImple.NUM);

    }

}
