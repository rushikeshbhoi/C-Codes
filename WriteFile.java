import java.io.*;

class WriteFile
{
    public static void main(String Args[])
    {
        try
        {
           String Data = "Rushikesh Bhoi";
           byte Arr[] = Data.getBytes();

           FileOutputStream fobj = new FileOutputStream("Rushikesh.txt");
           fobj.write(Arr);
        }

        catch(Exception obj)
        {}
    }
}