
class Rushi
{
    public int i;
    public int j;

    public Rushi()
    {
        System.out.println("Inside default constructor");
        this.i = 0;
        this.j = 0;
    }

    public Rushi(int a, int b)
    {
        System.out.println("Inside parameterised constructor");
        this.i = a;
        this.j = b;
    }

    public void Fun()
    {
        System.out.println("Inside Fun method");
    }
}

class ClassDemo
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main");

        Rushi robj1 = new Rushi();         // Default constructor
        Rushi robj2 = new Rushi(11,21);    // Parameterised constructor

        System.out.println(robj2.i);    // 11
        System.out.println(robj2.j);    // 21

        robj2.Fun();
    }
}