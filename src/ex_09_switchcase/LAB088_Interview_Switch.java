package ex_09_switchcase;

public class LAB088_Interview_Switch {

    public static void main(String[] args) {

        int code=001;
     switch (code)


        {
            case 001,002:
                System.out.println("electronic gadget");
                break;
            case 004,006:
                System.out.println("mech product");
                break;
            default:
                System.out.println("INVALID GADGET");
                break;

        }

    }
}
