package Tasks;

public class Task004_MaxNumbers {

    public static void main(String[] args) {
        String a=args[0];
        Integer _a=Integer.parseInt(a);
        String b=args[1];
        Integer _b=Integer.parseInt(b);
        String max=(_a>_b)?"a is max":"b is max";
        System.out.println(max);

    }
}
