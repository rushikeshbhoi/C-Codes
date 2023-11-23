import java.io.*;

class DeleteFile
{
    public static void main(String Args[])
    {
        try
        {
           File fobj = new File("Rushikesh.txt");
           fobj.delete();
        }

        catch(Exception obj)
        {}
    }
}