class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }

    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}

class FinalizeDemo1
{
    public static void main(String Arg[])
    {
        Employee eobj = new Employee("Rushi",78000,23,"At Post Muktainagar");
        eobj.Display();
        String str = "RUSHIKESH";
        
        System.out.println(eobj.getClass());
        System.out.println(str.getClass());

    }   
}