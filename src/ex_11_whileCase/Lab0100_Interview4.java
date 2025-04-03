package ex_11_whileCase;

import java.util.Scanner;

public class Lab0100_Interview4 {
    public static void main(String[] args) {

        Scanner _sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=_sc.nextInt();
        int fact_num=1;
        if(num<=0)
        {
            System.out.println(fact_num);
        }
        else

        {

            for (int i=1;i<=num;i++)
            {
                fact_num=fact_num*i;
            }
            System.out.println(fact_num);
        }


    }
}
