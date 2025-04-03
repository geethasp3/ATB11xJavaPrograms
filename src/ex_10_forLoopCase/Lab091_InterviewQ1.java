package ex_10_forLoopCase;

public class Lab091_InterviewQ1 {
    public static void main(String[] args)
    {

        for (int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                if(i==20)
                {
                    //break;
                    continue;
                }
                System.out.println(i+": is even");
            }
            else {
                System.out.println(i+" is odd");
            }
        }
    }
}
