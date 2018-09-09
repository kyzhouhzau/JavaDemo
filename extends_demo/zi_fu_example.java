package extends_demo;/*一个对象实例化过程，
*1.Person p = new Person()
*2.jvm读取指定路径下的Person.class文件，并加载进内存，并会先加载Person的父类。
*3.在堆内存中开辟空间分配地址
* 4。并在对象中，对对象中的属性默认初始化
* 5。调用对应的构造函数进行初始化。
* 6。在构造函数中第一行会先调用父类中的构造函数惊醒初始化
* 7.父类初始化完成后再对子类属性初始化。
* 8.再进行子类构造函数的特定初始化
* 8。初始化完毕后将地址赋值给 引用变量
* */

public class zi_fu_example {
    public static void main(String[] args) {

        z z=new z();
        z.show();
    }

}


class F {
    F() {
        super();
        show();
        return;
    }

    void show() {
        System.out.println("extends_demo.fu show");
    }
}

class z extends F {
    int num = 8;

    z() {
        super();
        //通过super()初始化父类内容时，子类成员变量并未显示初始化，等super()父类初始化完毕后，
        //才进行子类成员的变量初始化
        return;

    }

    //覆盖父类的show
    void show() {
        System.out.print("extends_demo.zi show..."+num);

    }
}
