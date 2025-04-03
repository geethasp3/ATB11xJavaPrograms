package Tasks;

import java.util.Scanner;

public class Task005_EvenorOddNum {
    public static void main(String[] args) {

        Scanner _sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=_sc.nextInt();

        if ((num%2==0))
        {
            System.out.println("Number is even");
        }

        else

        {
            System.out.println("Number is odd");
        }
    }
}
