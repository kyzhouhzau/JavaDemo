package Keyword_demo;

public class this_use {
    public static void main(String[] args) {
        Person p = new Person("zhoukaiyin",8);
        p.speak();
        Person p1 = new Person("zhoukaijuan", 8);
        p.compare(p1);
    }
}

class Person
{
    private String name;//成员变量，
    private int age;
    Person()
    {
        name = "baby";
        age = 1;
        System.out.println("Keyword_demo.Person run");
    }

    Person(String name)
    {
        this.name = name;//this代表当前对象。就是所在函数所属对象的引用。
    }
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    void speak() {
        System.out.println("My name is : "+name);
        System.out.println("My age is : "+ age);
    }

    public boolean compare(Person p) {
        if (this.age == p.age) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}


