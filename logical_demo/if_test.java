package logical_demo;

public class if_test
{
    public static void main(String[] args) {
        /*
        需求：根据用户指定的数据，判断星期。

        思路：用户输入无法获取但是那只是具体数据的一种获取手段而已。
        我们所要做的是对用户指定的数据进行对应星期的打印而已。
        所以具体的数据不去确定，完全可以使用变量来表示。
        因为数据的不确定性，所以要对数据进行判断。
         */
        int week=2;
        if (week == 1)
            System.out.println(week+"对应时间，下星期一");
        else if (week == 2)
            System.out.println(week+"对应时间，下星期二");
        else if (week == 3)
            System.out.println(week+"对应时间，下星期三");
        else if (week == 4)
            System.out.println(week+"对应时间，下星期四");
        else if (week == 5)
            System.out.println(week+"对应时间，下星期五");
        else if (week == 6)
            System.out.println(week+"对应时间，下星期六");
        else if (week == 7)
            System.out.println(week+"对应时间，下星期日");
        else
            System.out.println("没有对应的星期");
    }
}
