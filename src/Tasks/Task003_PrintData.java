package Tasks;

public class Task003_PrintData {

    public static void main(String[] args) {
        String Name=args[0];
        String age=args[1];
        Integer int_age=Integer.parseInt(age);
        String Salary=args[2];
        Integer int_sal=Integer.parseInt(Salary);
        System.out.println("Name:"+Name);
        System.out.println("Age:"+int_age);
        System.out.println("Salary:" +int_sal);
    }
}
