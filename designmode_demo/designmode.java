package designmode_demo;/*
 * 设计模式：对问题行之有效的解决方法。是一种解决问题的思想。
 *1,单例设计模式。
 *       解决的问题：就是保证一个类在内存中的对象是唯一的。
 *
 *必须对多个程序使用同一个配置信息对象时，就要保证该对象的唯一性。
 *
 * 如何保证对象的唯一性？
 * 1.不允许其他程序用new创建类对象。
 * 2.在该类中创建一个本类的实例。
 * 3.对外提供一个方法让其他程序可以获取该对象。
 *
 * 步骤：
 * 1.私有化构造函数。
 * 2.通过new在本类中创建一个本类对象。
 * 3.定义一个公有方法，将创建的对象返回。
 *
 * */

class Test {
    //让成员变量可控
    private static Test S = new Test();
    private Test(){}
    //单独定义函数让变量S可控。
    public static Test getinstance() {
        return S;
    }
    private int num;
    public void setnum(int num) {
        this.num = num;
    }

    public int getnum() {
        return num;
    }
}


//单利延迟加载
class Single{
    private static Single s = null;
    private Single(){}

    public static Single getInstance() {
        if (s == null)
            s = new Single();
        return s;
    }
}

//在函数中写入设计模式后属性变成固定的

class designmode {

    public static void main(String[] args) {
        //先要实例化
        Test s1 = Test.getinstance();
        Test s2 = Test.getinstance();
        s1.setnum(10);
        s2.setnum(20);
        System.out.println(s1.getnum());
        System.out.println(s2.getnum());
    }
}
