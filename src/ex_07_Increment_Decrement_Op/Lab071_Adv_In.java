package ex_07_Increment_Decrement_Op;

import java.sql.SQLOutput;

public class Lab071_Adv_In {

    public static void main(String[] args) {

        int a=10;
        System.out.println(a++ + ++a );
        System.out.println(a);
        int b=10;
        System.out.println(b++ + b++);
        System.out.println(b);
int c=10;
        System.out.println(++c + ++c);//11+12=23
        System.out.println(c);//12

    }
}
