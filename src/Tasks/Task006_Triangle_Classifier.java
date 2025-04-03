package Tasks;

import java.util.Scanner;

public class Task006_Triangle_Classifier {

    public static void main(String[] args) {


        Scanner _sc=new Scanner(System.in);
        System.out.println("Enter a ");
        System.out.println("Enter b");
        System.out.println("Enter c");


        int a=_sc.nextInt();

        int b=_sc.nextInt();

                int c=_sc.nextInt();
        if (a==b && b==c && a==c)
        {
            System.out.println("the triangle is equilateral");
        }

        if(a==b && c!=a && c!=b)
        {
            System.out.println("the triangle is isoseles");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
