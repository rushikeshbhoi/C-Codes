import java.io.*;

class ReadFile
{
    public static void main(String Args[])
    {
        try
        {
           FileInputStream fobj = new FileInputStream("Rushikesh.txt");
           int i = 0;

           while((i = fobj.read()) != -1)
           {
                System.out.print((char)i);
           }
           System.out.println();
        }

        catch(Exception obj)
        {}
    }
}