interface Mathematics
{
    public int Addition(int A, int B);
    public int Substraction(int A, int B);
}

class Rushi implements Mathematics
{
    public int Addition(int A, int B)
    {
        return A + B;
    }
    
    public int Substraction(int A, int B)
    {
        return A - B;
    }
}

class InterfaceDemo
{
    public static void main(String Args[])
    {
        Rushi robj = new Rushi();
        int iRet = 0;
        
        iRet = robj.Addition(11,10);
        System.out.println("Addition is : "+iRet);

        iRet = robj.Substraction(11,10);
        System.out.println("Substraction is : "+iRet);
    }
}