package ex_09_switchcase;

import java.util.Scanner;

public class Lab090_SwitchCase2 {
    public static void main(String[] args) {

        Scanner _sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = _sc.next();

        switch (browser) {
            case "chrome":
                System.out.println("TC run on chrome");
                break;

            case "mozilla":

                System.out.println("TC run on mozilla");
                break;


            default:
                System.out.println("Invalid browser");
        }
    }
}