package ex_08_IfCondition;

import java.util.Scanner;

public class Lab080_If_ex {
    public static void main(String[] args) {

        Scanner _scanner=new Scanner(System.in);


        System.out.print("Enter age:");
        int age=_scanner.nextInt();

        if(age>18)
        {
            System.out.println("Allowed to vote");


        }

        else
        {
            System.out.println("Cant vote");
        }
    }
}
