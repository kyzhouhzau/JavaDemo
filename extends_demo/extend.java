package extends_demo;

/*
* 为什么不能多继承？
* 多个父类中可能存在相同属性而产生11奇异
*
* */
class Person_
{
    String name="zhou";
//    int age=12;
    //子类不能调用父类的私有变量，但是可以通过创建函数调用
    private int age=12;

    public int getnum() {
        return age;
    }
}
//当本类中的成员和局部成员变量同名用this；
//当本类中的成员与符类中的相同父类用super 代表父类。但是super 代表一个父类空间。
class Student extends Person_{

    Student(){
        //super();调用的是父类中的空参数构造函数；
    }
    int age=23;
    void study() {

        System.out.println(name);
        System.out.println(this.age+"...."+super.getnum());
    }

}

class worker extends Person_ {
    void work() {
        System.out.println(super.getnum());
    }
}

class extend {
    public static void main(String[] args) {
        worker w = new worker();
        w.work();
        Student s = new Student();
        s.study();
    }
}