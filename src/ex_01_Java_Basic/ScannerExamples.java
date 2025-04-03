package ex_01_Java_Basic;

public class ScannerExamples {

    public static void main(String[] args)
    {
        /*
        int a=12;
        int b=20;

        int c=a+b;
        System.out.println(c);


        String f_name="geetha";
        String l_name="panicker";
        String Fullname=f_name+l_name;
        System.out.println(Fullname);

         */

Animal dog=new Animal("bLACK","CARNIVOROUS");
System.out.println(dog.Color);
        System.out.println(dog.classfication);

        BaseTest _baset=new BaseTest();
        _baset.driver="chrome";
       // _baset.filepath= Properties.filepath;

    }
}
