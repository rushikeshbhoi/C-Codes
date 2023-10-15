class Demo
{
    public int A;
    public final int B;
    Demo()
    {
        A = 11;
        B = 21;
    }
    Demo(int i, int j)
    {
        A = i;
        B = j;
    }
}

class Final1
{
    public static void main(String Args[])
    {
        Demo dobj = new Demo();
        System.out.println("The Value of A : "+dobj.A);
        System.out.println("The Value of B : "+dobj.B);
        dobj.A++;
        // dobj.B++;

        Demo dobj2 = new Demo(51,101);
        System.out.println("The Value of A : "+dobj2.A);
        System.out.println("The Value of B : "+dobj2.B);
    }
}