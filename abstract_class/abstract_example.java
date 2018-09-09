package abstract_class;
/*
* 标题：abstract Test
* 需求：公司中程序员有姓名，工号，薪水，工作内容。
* 项目经理除了有以上之外还有奖金
* 对给出的需求进行数据建模
* */

abstract class Employee {
    private String name;
    private int num;
    private double salary;

    Employee(String name, int num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public abstract void work();
}

class Programmer extends Employee {
    Programmer(String name, int num, double salary) {
        super(name,num,salary);
    }


    public void work() {
        System.out.println("programming......");
    }
}

class Manager extends Employee {
    private double bonus;
    Manager(String name, int num, double salary,double bonus) {

        super(name, num, salary);
        this.bonus = bonus;
    }


    public void work() {
        System.out.println("maager......");
    }
}

public class abstract_example {
    public static void main(String[] args) {

    Manager manager = new Manager("zhou",26,3000,2000);
    manager.work();

    }

}
