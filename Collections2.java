import java.util.*;

class Collections2 
{
    public static void main(String Arg[]) 
    {
        Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();
        hobj.put("Rushi",75000);
        hobj.put("Abhi",65000);
        hobj.put("Jay",60000);
        hobj.put("Om",95000);

        System.out.println(hobj.get("Rushi"));

        Enumeration eobj = hobj.keys();
        while (eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}
