import java.io.*;

class CreateFile
{
    public static void main(String Args[])
    {
        try
        {
            File fobj = new File("Rushikesh.txt");
            fobj.createNewFile();
        }

        catch(Exception fobj)
        {}
    }
}