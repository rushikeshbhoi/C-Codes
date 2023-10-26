import java.util.*;

class ExceptionDemo1
{
    public static void main(String Argsp[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 / iNo2;         // If we number by zero then it will throw the exception

        System.out.println("Division is : "+ iAns);
    }
}