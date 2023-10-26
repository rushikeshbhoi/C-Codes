import java.util.*;

class ExceptionDemo2
{
    public static void main(String Argsp[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};   

        System.out.println("Enter the index from where you want to fetch the data");
        int iIndex = sobj.nextInt();

        System.out.println("Data is "+Arr[iIndex]); // If we accessing the array element by giving 6th index then it throw exception
    }
}