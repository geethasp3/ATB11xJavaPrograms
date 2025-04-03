package ex_11_whileCase;

import java.util.Scanner;

public class Lab0098_Interview2 {
    public static void main(String[] args) {


        Scanner _sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=_sc.nextInt();

        while (num%2==0)
        {
            System.out.println("Number is even");
        }
        System.out.println("Number is odd");
    }
}
