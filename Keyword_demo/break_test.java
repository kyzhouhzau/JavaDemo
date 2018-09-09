package Keyword_demo;

public class break_test {
    //break;与continute;只与作用域有关

    public static void main(String[] args) {
        //可以给循环加名称；
        loop1:
        for(int x = 1; x <= 3; x++) {
            loop2:
            for(int y = 0; y < 10; y++) {
                System.out.println(x);
                break loop1;
            }

        }
        for (int x=1;x<4;x++) {
            System.out.println(x);
            continue;
        }


    }
}
