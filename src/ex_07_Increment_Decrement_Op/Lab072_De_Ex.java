package ex_07_Increment_Decrement_Op;

public class Lab072_De_Ex {

    public static void main(String[] args) {

        int a=10;
        System.out.println(a-- + a--);//10 +9
        System.out.println(a);//8

        int b=10;
        System.out.println(b++ + b--);//10+11
        System.out.println(b);//10

        int c=10;
        System.out.println(++c + --c);//11+10=21
        System.out.println(c);//c

        int d=10;
        System.out.println(--d + d++);//9+9=18
        System.out.println(d);//10

    }
}
