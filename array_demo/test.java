package array_demo;

import array_demo.array_my;

public class test {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 5, 6, 7, 8};
        int x = array_my.get_maxindex(array);
        array_my.sort(array);
        array_my.print(array);
//        tool.print(x);
    }

}



